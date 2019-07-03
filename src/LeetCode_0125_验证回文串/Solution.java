package LeetCode_0125_验证回文串;

/**
 * @Author OliverYu
 * @Date 2019/7/3 22:44
 * @Email 253757635@qq.com
 * @Description TODO
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *  输入: "A man, a plan, a canal: Panama"
 *  输出: true
 *
 * 示例 2:
 *  输入: "race a car"
 *  输出: false
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (!isLetterOrNum(s.charAt(i))) {
                i++;
            } else if (!isLetterOrNum(s.charAt(j))) {
                j--;
            } else {
                if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isLetterOrNum(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            return true;
        }
        return false;
    }
}
