package LeetCode_0034_在排序数组中查找元素的第一个和最后一个位置;

import java.util.Arrays;

/**
 * @Author OliverYu
 * @Date 2019/6/28 22:55
 * @Email 253757635@qq.com
 * @Description
 *
 *      给定一个按照升序排列的整数数组 nums，和一个目标值 target。
 *      找出给定目标值在数组中的开始位置和结束位置。
 *      你的算法时间复杂度必须是 O(log n) 级别。
 *      如果数组中不存在目标值，返回 [-1, -1]。
 *
 *      示例 1:
 *          输入: nums = [5,7,7,8,8,10], target = 8
 *          输出: [3,4]
 *      示例 2:
 *          输入: nums = [5,7,7,8,8,10], target = 6
 *          输出: [-1,-1]
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] destination = {-1,-1};
        int left = binarySearch(nums, target, true);
        if (left == nums.length || nums[left] != target) {
            return destination;
        }
        destination[0] = left;
        destination[1] = binarySearch(nums,target,false) - 1;
        return destination;
    }

    public int binarySearch(int[] nums,int target,boolean toLeft) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target < nums[mid] || (toLeft && target == nums[mid])) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
