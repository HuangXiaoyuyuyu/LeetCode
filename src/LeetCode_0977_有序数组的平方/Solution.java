package LeetCode_0977_有序数组的平方;

/**
 * @Author OliverYu
 * @Date 2019/7/28 22:16
 * @Email 253757635@qq.com
 * @Description 双指针
 */
public class Solution {
    public int[] sortedSquares(int[] A) {
        if (A.length == 0) {
            return A;
        }
        if (A.length == 1) {
            A[0] = A[0] * A[0];
            return A;
        }
        int[] tempArr = new int[A.length];
        int i = 0;
        int j = tempArr.length - 1;
        int k = j;
        while (i <= j) {
            if (A[i] * A[i] <= A[j] * A[j]) {
                tempArr[k] = A[j] * A[j];
                j--;
            }else {
                tempArr[k] = A[i] * A[i];
                i++;
            }
            k--;
        }
        return tempArr;
    }
}
