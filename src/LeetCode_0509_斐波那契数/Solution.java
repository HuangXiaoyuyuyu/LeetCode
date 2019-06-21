package LeetCode_0509_斐波那契数;

/**
 * @Author OliverYu
 * @Date 2019/6/21 23:03
 * @Email 253757635@qq.com
 * @Description 能不用递归就不用递归！！！
 */
public class Solution {
    public int fib(int N) {
        long fOne = 0;
        long fTwo = 1;
        long fN = 0;
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return (int)fTwo;
        }
        for (int i=2; i<=N; i++) {
            fN = fOne + fTwo;
            fOne = fTwo;
            fTwo = fN;
        }
        return (int)fN;
    }
}
