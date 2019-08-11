package LeetCode_0537_复数乘法;

/**
 * @Author OliverYu
 * @Date 2019/8/11 19:55
 * @Email 253757635@qq.com
 * @Description 简单的复数运算
 *
 * 给定两个表示复数的字符串。返回表示它们乘积的字符串。注意，根据定义 i2 = -1 。
 *
 * 示例 1:
 *  输入: "1+1i", "1+1i"
 *  输出: "0+2i"
 *  解释: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i ，你需要将它转换为 0+2i 的形式。
 *
 * 示例 2:
 *  输入: "1+-1i", "1+-1i"
 *  输出: "0+-2i"
 *  解释: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i ，你需要将它转换为 0+-2i 的形式。
 *
 * 注意:
 *  输入字符串不包含额外的空格。
 *  输入字符串将以 a+bi 的形式给出，其中整数 a 和 b 的范围均在 [-100, 100] 之间。
 *  输出也应当符合这种形式。
 */
public class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] aStrings = a.split("\\+");
        String[] bStrings = b.split("\\+");
        int aRealPart = Integer.valueOf(aStrings[0]);
        int aImaginaryPart = Integer.valueOf(aStrings[1].substring(0,aStrings[1].length() - 1));
        int bRealPart = Integer.valueOf(bStrings[0]);
        int bImaginaryPart = Integer.valueOf(bStrings[1].substring(0,bStrings[1].length() - 1));

        return (aRealPart*bRealPart - aImaginaryPart*bImaginaryPart) + "+" + (aRealPart*bImaginaryPart + aImaginaryPart*bRealPart) + "i";
    }
}
