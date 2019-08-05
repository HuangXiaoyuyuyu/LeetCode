package LeetCode_0917_仅仅反转字母;

/**
 * @Author OliverYu
 * @Date 2019/8/5 22:21
 * @Email 253757635@qq.com
 * @Description 双指针
 *
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，
 * 而所有字母的位置发生反转。
 *
 * 示例 1：
 *  输入："ab-cd"
 *  输出："dc-ba"
 *
 * 示例 2：
 *  输入："a-bC-dEf-ghIj"
 *  输出："j-Ih-gfE-dCba"
 *
 * 示例 3：
 *  输入："Test1ng-Leet=code-Q!"
 *  输出："Qedo1ct-eeLg=ntse-T!"
 *
 * 提示：
 *  S.length <= 100
 *  33 <= S[i].ASCIIcode <= 122 
 *  S 中不包含 \ or "
 */
public class Solution {
    public String reverseOnlyLetters(String S) {
        int i = 0;
        int j = S.length() - 1;
        char[] chars = S.toCharArray();
        char temp = 0;
        while (i <= j) {
            if (isAlphabet(chars[i]) && isAlphabet(chars[j])) {
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }else if (isAlphabet(chars[i])) {
                j--;
            }else if(isAlphabet(chars[j])) {
                i++;
            }else {
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    private boolean isAlphabet(char a) {
        if ((a >= 65 && a <= 90) || (a >= 97 && a<= 122)) {
            return true;
        }
        return false;
    }
}
