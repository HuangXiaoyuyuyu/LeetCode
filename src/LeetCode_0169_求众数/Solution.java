package LeetCode_0169_求众数;

/**
 * @Author OliverYu
 * @Date 2019/6/23 21:20
 * @Email 253757635@qq.com
 * @Description 基于摩尔投票
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int sum = 0;
        int candidate = 0;
        for (int num : nums) {
            if (sum == 0) {
                candidate = num;
            }
            sum = sum + (candidate == num ? 1 : -1);
        }
        return candidate;
    }
}
