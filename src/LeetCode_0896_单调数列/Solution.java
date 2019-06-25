package LeetCode_0896_单调数列;

/**
 * @Author OliverYu
 * @Date 2019/6/25 22:50
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public boolean isMonotonic(int[] A) {
        return isIncrease(A) || isDecrease(A);
    }

    public boolean isIncrease(int[] A) {
        int len = A.length;
        for (int i=0; i<len-1; i++) {
            if (A[i] > A[i+1]) {
                return false;
            }
        }
        return true;
    }

    public boolean isDecrease(int[] A) {
        int len = A.length;
        for (int i=0; i<len-1; i++) {
            if (A[i] < A[i+1]) {
                return false;
            }
        }
        return true;
    }
}
