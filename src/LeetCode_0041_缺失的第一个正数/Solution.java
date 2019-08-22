package LeetCode_0041_缺失的第一个正数;

/**
 * @Author OliverYu
 * @Date 2019/8/22 21:47
 * @Email 253757635@qq.com
 * @Description TODO
 *
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 *
 * 示例 1:
 *  输入: [1,2,0]
 *  输出: 3
 *
 * 示例 2:
 *  输入: [3,4,-1,1]
 *  输出: 2
 *
 * 示例 3:
 *  输入: [7,8,9,11,12]
 *  输出: 1
 *
 * 说明:
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的空间。
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        int[] tempArr = new int[len + 1];
        for (Integer i : nums) {
            if (i > 0 && i <= len) {
                tempArr[i] = 1;
            }
        }
        for (int i = 1; i < tempArr.length; i++) {
            if (tempArr[i] != 1) {
                return i;
            }
        }
        return len + 1;
    }
}
