package LeetCode_0283_移动零;

/**
 * @Author OliverYu
 * @Date 2019/4/21 20:58
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i=0; i<nums.length; i++) {
           if (nums[i] != 0) {
               nums[index] = nums[i];
               index++;
           }
        }

        for (int i=index; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}
