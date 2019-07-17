package LeetCode_0434_字符串中的单词数;

/**
 * @Author OliverYu
 * @Date 2019/7/17 21:41
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int countSegments(String s) {
        if (s.equals("") || s.replace(" ","").equals("")) {
            return 0;
        }
        s = s.trim();
        int count = 0;
        int len = s.length();
        int index = s.indexOf(" ");
        if (index == -1) {
            return 1;
        }
        if (index == len - 1 || index == 0) {
            return 1;
        }
        for(int i=index; i<len - 1; i++) {
            if (s.charAt(i+1) != ' ' && s.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }
}
