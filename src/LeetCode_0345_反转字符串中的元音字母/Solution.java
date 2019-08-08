package LeetCode_0345_反转字符串中的元音字母;

/**
 * @Author OliverYu
 * @Date 2019/8/8 22:56
 * @Email 253757635@qq.com
 * @Description TODO
 *
 *编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *  输入: "hello"
 *  输出: "holle"
 *
 * 示例 2:
 *  输入: "leetcode"
 *  输出: "leotcede"
 *
 * 说明:
 *  元音字母不包含字母"y"。
 */
public class Solution {
    public String reverseVowels(String s) {
        if (null == s || s.length() < 2) {
            return s;
        }
        char[] strArrays = s.toCharArray();
        String vowel = "aeiouAEIOU";
        for (int i = 0, j = strArrays.length - 1; i < j; ) {
            if (vowel.indexOf(strArrays[i]) == -1) {
                ++i;
            } else if (vowel.indexOf(strArrays[j]) == -1) {
                --j;
            } else {
                char temp = strArrays[i];
                strArrays[i++] = strArrays[j];
                strArrays[j--] = temp;
            }
        }
        return String.copyValueOf(strArrays);
    }
}
