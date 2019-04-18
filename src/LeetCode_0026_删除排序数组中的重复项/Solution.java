package LeetCode_0026_删除排序数组中的重复项;

/**
 * @Author OliverYu
 * @Date 2019/4/18 21:52
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int number = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[number] != nums[i]) {
                number++;
                nums[number] = nums[i];
            }
        }
        return number+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,2,2,3,3,4,4,5,6,77,77,77};
        System.out.println(new Solution().removeDuplicates(nums));
    }
}
