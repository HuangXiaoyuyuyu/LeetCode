package LeetCode_0461_汉明距离;

/**
 * @Author OliverYu
 * @Date 2019/9/3 21:39
 * @Email 253757635@qq.com
 * @Description TODO
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 注意：
 * 0 ≤ x, y < 231.
 *
 * 示例:
 *  输入: x = 1, y = 4
 *  输出: 2
 *
 * 解释:
 *  1   (0 0 0 1)
 *  4   (0 1 0 0)
 *         ↑   ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 */
public class Solution {
    //方法一：两个数转换为二进制 然后异或
    /*public int hammingDistance(int x, int y) {
        return Integer.toBinaryString(x^y).replaceAll("0","").length();
    }*/

    //方法二：先异或 然后通过汉明重量进行计算。
    public int hammingDistance(int x, int y) {
        int count = 0;
        y = x ^ y;
        while(y != 0){
            y &= y -1;
            count++;
        }
        return count;
    }
}
