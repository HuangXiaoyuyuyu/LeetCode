package LeetCode_0922_按奇偶排序数组II;

/**
 * @Author OliverYu
 * @Date 2019/8/19 22:02
 * @Email 253757635@qq.com
 * @Description 双指针
 *
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 * 示例：
 *  输入：[4,2,5,7]
 *  输出：[4,5,2,7]
 *  解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *
 * 提示：
 *  2 <= A.length <= 20000
 *  A.length % 2 == 0
 *  0 <= A[i] <= 1000
 */
public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i=0; i<A.length; i=i+2) {
            if (A[i] % 2 != 0) {
                while (A[j] % 2 != 0) {
                    j = j + 2;
                }
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        return A;
    }
}
