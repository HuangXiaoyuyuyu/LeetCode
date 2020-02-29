package LeetCode_0058_最后一个单词的长度;

/**
 * @Author OliverYu
 * @Date 2019/7/19 23:24
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.equals("") || s.replace(" ","").equals("")) {
            return 0;
        }
        //方法一：字符串分割，取最后一个元素求长度。
        //String[] strings = s.trim().split(" ");
        //return strings[strings.length - 1].length();

        //方法二：删去最后的空格，截取最后一个空格到最后的长度。
        int index = s.trim().lastIndexOf(" ");
        return s.trim().substring(index + 1).length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(new Solution().lengthOfLastWord(s));
    }
}
