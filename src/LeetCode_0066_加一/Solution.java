package LeetCode_0066_加一;

/**
 * @Author OliverYu
 * @Date 2019/4/20 22:19
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1; i>=0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {
        int[] a = new Solution().plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
