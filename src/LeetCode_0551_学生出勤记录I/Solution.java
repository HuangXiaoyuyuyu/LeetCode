package LeetCode_0551_学生出勤记录I;

/**
 * @Author OliverYu
 * @Date 2019/7/26 22:55
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public boolean checkRecord(String s) {
        int len = s.length();
        int countA = 0;
        int countL = 0;
        int continueL = 0;
        for(int i=0; i<len; i++) {
            if (s.charAt(i) == 'A') {
                countA++;
            }
            if (s.charAt(i) == 'L') {
                countL++;
                if (countL > continueL) {
                    continueL = countL;
                }
            }else {
                countL = 0;
            }
        }
        if (countA <= 1 && continueL <= 2) {
            return true;
        }
        return false;
    }
}
