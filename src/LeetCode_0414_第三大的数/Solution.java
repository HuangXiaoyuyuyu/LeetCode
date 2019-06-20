package LeetCode_0414_第三大的数;

/**
 * @Author OliverYu
 * @Date 2019/6/20 22:42
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int thirdMax(int[] nums) {
        long firstValue = Long.MIN_VALUE;
        long secondValue = Long.MIN_VALUE;
        long thirdValue = Long.MIN_VALUE;
        for (long num : nums) {
            if (num > firstValue) {
                thirdValue = secondValue;
                secondValue = firstValue;
                firstValue = num;
            }else if (num < firstValue && secondValue < num) {
                thirdValue = secondValue;
                secondValue = num;
            }else if (num < secondValue && thirdValue < num) {
                thirdValue = num;
            }
        }
        return (thirdValue == Long.MIN_VALUE || thirdValue == secondValue) ? (int)firstValue : (int)thirdValue;
    }
}
