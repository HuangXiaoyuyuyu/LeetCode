package LeetCode_0976_三角形的最大周长;

/**
 * @Author OliverYu
 * @Date 2019/9/6 22:48
 * @Email 253757635@qq.com
 * @Description 冒泡排序 从高到低 先取出最高的三个 如果不能构成 在找出第四个 以此类推
 *
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、
 * 面积不为零的三角形的最大周长。
 *
 * 如果不能形成任何面积不为零的三角形，返回 0。
 *
 * 示例 1：
 *  输入：[2,1,2]
 *  输出：5
 *
 * 示例 2：
 *  输入：[1,2,1]
 *  输出：0
 *
 * 示例 3：
 *  输入：[3,2,3,4]
 *  输出：10
 *
 * 示例 4：
 *  输入：[3,6,2,3]
 *  输出：8
 *
 * 提示：
 *  3 <= A.length <= 10000
 *  1 <= A[i] <= 10^6
 */
public class Solution {
    public int largestPerimeter(int[] A) {
        int len = A.length;
        int result = 0;
        int count = 0;
        for (int i = len; i > 0; i--) {
            count++;
            for (int j = 1; j < i; j++) {
                if (A[j - 1] > A[j]) {
                    swap(A, j - 1, j);
                }
            }
            if (count >= 3) {
                if (A[i - 1] + A[i] > A[i + 1]) {
                    result = A[i - 1] + A[i] + A[i + 1];
                    return result;
                } else {
                    continue;
                }
            }
        }
        return 0;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
