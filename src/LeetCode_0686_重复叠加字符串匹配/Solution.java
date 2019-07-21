package LeetCode_0686_重复叠加字符串匹配;

/**
 * @Author OliverYu
 * @Date 2019/7/20 23:21
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int repeatedStringMatch(String A, String B) {
        String tempString = A;
        int count = 1;
        while (A.length() < B.length()) {
            A += tempString;
            count ++;
        }
        if (A.indexOf(B) >= 0) {
            return count;
        }
        A = A + tempString;
        if (A.indexOf(B) >= 0) {
            return count + 1;
        }
        return -1;
    }
}
