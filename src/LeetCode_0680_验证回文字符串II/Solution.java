package LeetCode_0680_验证回文字符串II;

/**
 * @Author OliverYu
 * @Date 2019/8/10 22:37
 * @Email 253757635@qq.com
 * @Description TODO
 *
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 * 示例 1:
 *  输入: "aba"
 *  输出: True
 *
 * 示例 2:
 *  输入: "abca"
 *  输出: True
 *  解释: 你可以删除c字符。
 */
public class Solution {
    public boolean validPalindrome(String s) {
        int i=-1;
        int j=s.length();
        while(++i<--j){
            if(s.charAt(i)!=s.charAt(j)){
                //不等的话删去一个字符
                return isPalindrome(s,i,j-1)||isPalindrome(s,i+1,j);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
}
