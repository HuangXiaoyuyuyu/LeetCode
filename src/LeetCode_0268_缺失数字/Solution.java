package LeetCode_0268_缺失数字;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author OliverYu
 * @Date 2019/8/23 22:01
 * @Email 253757635@qq.com
 * @Description TODO
 *
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 *  输入: [3,0,1]
 *  输出: 2
 *
 * 示例 2:
 *  输入: [9,6,4,2,3,5,7,0,1]
 *  输出: 8
 *
 * 说明:
 *  你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 */
public class Solution {
    //方法一：求出1 ~ n 的和减去数组中所有的数字，剩余的就是没有出现的。
    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 1,length=nums.length; i <= length; i++) {
            result += i - nums[i-1];

        }
        return result;
    }

    //方法二：异或
    /*public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }*/

    //方法三：将数组的数字放入一个set中，然后依次判断是否包含1 ~ n之间的数字 效率低
    /*public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums) {
            set.add(i);
        }
        for (int i=0 ; i<nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return nums.length;
    }*/
}
