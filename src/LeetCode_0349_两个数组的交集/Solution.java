package LeetCode_0349_两个数组的交集;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author OliverYu
 * @Date 2019/9/1 22:13
 * @Email 253757635@qq.com
 * @Description TODO
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *  输入: nums1 = [1,2,2,1], nums2 = [2,2]
 *  输出: [2]
 *
 * 示例 2:
 *  输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 *  输出: [9,4]
 *
 * 说明:
 *  输出结果中的每个元素一定是唯一的。
 *  我们可以不考虑输出结果的顺序。
 */
public class Solution {
    //方法一：两个数组分别放到set中，得到两个set。
    // 判断size小的那个set中的元素是否在size大的set中。
    /*public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (Integer i : nums1) {
            set1.add(i);
        }
        for (Integer i : nums2) {
            set2.add(i);
        }
        return set1.size() > set2.size() ? result(set2, set1) : result(set1, set2);
    }

    private int[] result(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] output = new int[set1.size()];
        int index = 0;
        for (Integer s : set1) {
            if (set2.contains(s)) {
                output[index++] = s;
            }
        }
        return Arrays.copyOf(output,index);
    }*/

    //方法二：将num1中的元素放入set中，判断set中是否包含num2的元素，
    // 如果包含将该元素加入数组，同时set中移除这个元素。
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1)
            set.add(i);
        int index = 0;
        for (int i : nums2) {
            if (set.contains(i)) {
                res[index++] = i;
                set.remove(i);
            }
        }
        return Arrays.copyOf(res, index);
    }
}
