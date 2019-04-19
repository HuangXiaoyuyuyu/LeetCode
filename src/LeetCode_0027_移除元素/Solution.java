package LeetCode_0027_移除元素;

/**
 * @Author OliverYu
 * @Date 2019/4/19 22:54
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[len] = nums[i];
                len++;
            }
        }
        return len;
    }
}
