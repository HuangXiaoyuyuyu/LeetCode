package LeetCode_0287_寻找重复数;

/**
 * @Author OliverYu
 * @Date 2019/6/27 22:44
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        if (true) {
            // 找到快慢指针相遇的地方
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (fast != slow) {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            // 用一个新指针从头开始，直到和慢指针相遇
            fast = 0;
            while (fast != slow) {
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;
        }
        return -1;
    }
}
