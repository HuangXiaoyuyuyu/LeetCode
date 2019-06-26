package LeetCode_0217_存在重复元素;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author OliverYu
 * @Date 2019/6/26 22:51
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i=0; i<len; i++) {
            set.add(nums[i]);
        }
        return len == set.size() ? false : true;
    }
}
