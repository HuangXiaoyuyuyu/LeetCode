package LeetCode_0032_最长有效括号;

import java.util.Stack;

/**
 * @Author OliverYu
 * @Date 2019/6/29 22:15
 * @Email 253757635@qq.com
 * @Description TODO
 *
 *
 *  给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 *
 *  示例 1:
 *      输入: "(()"
 *      输出: 2
 *      解释: 最长有效括号子串为 "()"
 *
 *  示例 2:
 *      输入: ")()())"
 *      输出: 4
 *      解释: 最长有效括号子串为 "()()"
 */

public class Solution {
    public int longestValidParentheses(String s) {
        int maxLens = 0;
        int len = s.length();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i=0; i<len; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxLens = Math.max(maxLens,i-stack.peek());
                }
            }
        }
        return maxLens;
    }
}
