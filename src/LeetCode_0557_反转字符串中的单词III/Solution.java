package LeetCode_0557_反转字符串中的单词III;

/**
 * @Author OliverYu
 * @Date 2019/8/7 22:29
 * @Email 253757635@qq.com
 * @Description TODO
 *
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *  输入: "Let's take LeetCode_0041_缺失的第一个正数 contest"
 *  输出: "s'teL ekat edoCteeL tsetnoc" 
 *
 *  注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<strings.length; i++) {
            stringBuilder.append(reverseString(strings[i])).append(" ");
        }
        return stringBuilder.delete(stringBuilder.length() - 1,stringBuilder.length()).toString();
    }

    private String reverseString(String s) {
        if (s.length() == 1) {
            return s;
        }
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        char temp = 0;
        while (i <= j) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
