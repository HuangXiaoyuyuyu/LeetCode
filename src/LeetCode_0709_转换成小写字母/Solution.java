package LeetCode_0709_转换成小写字母;

/**
 * @Author OliverYu
 * @Date 2019/6/30 21:50
 * @Email 253757635@qq.com
 * @Description TODO
 *
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
 * 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * 示例 1：
 *  输入: "Hello"
 *  输出: "hello"
 * 示例 2：
 *  输入: "here"
 *  输出: "here"
 * 示例 3：
 *  输入: "LOVELY"
 *  输出: "lovely"
 */
public class Solution {
    public String toLowerCase(String str) {
        int len = str.length();
        if (len == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<len; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                stringBuffer.append((char)(str.charAt(i) + 32));
            } else {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
