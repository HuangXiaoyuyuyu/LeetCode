package LeetCode_0771_宝石与石头;

/**
 * @Author OliverYu
 * @Date 2019/7/31 21:52
 * @Email 253757635@qq.com
 * @Description 这个题我尝试了HashpMap、HashSet和暴力解法，
 *              最终发现暴力解法效率最高，其次是HashSet。
 *
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
 * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * 示例 1:
 *  输入: J = "aA", S = "aAAbbbb"
 *  输出: 3
 * 示例 2:
 *  输入: J = "z", S = "ZZ"
 *  输出: 0
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        int total = 0;
        for (int i = 0; i < j.length; i++) {
            for (int k = 0; k < s.length; k++) {
                if(j[i] == s[k]) {
                    total ++;
                }
            }
        }
        return total;
    }
}
