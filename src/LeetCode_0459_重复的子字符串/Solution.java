package LeetCode_0459_重复的子字符串;

/**
 * @Author OliverYu
 * @Date 2019/8/9 22:59
 * @Email 253757635@qq.com
 * @Description TODO
 *
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。
 * 给定的字符串只含有小写英文字母，并且长度不超过10000。
 *
 * 示例 1:
 *  输入: "abab"
 *  输出: True
 *  解释: 可由子字符串 "ab" 重复两次构成。
 *
 * 示例 2:
 *  输入: "aba"
 *  输出: False
 *
 * 示例 3:
 *  输入: "abcabcabcabc"
 *  输出: True
 *  解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 */
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        //假设周期为i，由于至少重复一次，所以周期最大为(length / 2)
        for (int i = 1; i <= length / 2; i++) {
            // 重复的次数
            int times = length / i;
            // 如果重复后的长度不等于总的长度无需在处理
            if (i * times != length) {
                continue;
            }
            // 如果当前字符串跟第一个字符串不一致一定不是重复子串
            // 借助前面的判断避开下标越界
            if (s.charAt(i) != s.charAt(0)) {
                continue;
            }

            StringBuilder builder = new StringBuilder();
            String sub = s.substring(0, i);
            while (times-- > 0) {
                builder.append(sub);
            }
            if (builder.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
