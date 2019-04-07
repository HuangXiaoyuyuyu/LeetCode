package LeetCode_0150_逆波兰表达式求值;

import java.util.Stack;

/**
 * @Author OliverYu
 * @Date 2019/4/7 21:34
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String temp = "";
        int a = 0;
        int b = 0;
        for (int i=0; i<tokens.length; i++) {
            temp = tokens[i];
            switch (temp) {
                case "+" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b + a);
                    break;

                case "-" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    break;

                case "*" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b * a);
                    break;

                case "/" :
                    a = stack.pop();
                    b = stack.pop();
                    if (a == 0) {
                        return -1;
                    }else {
                        stack.push(b / a);
                    }
                    break;

                default:
                    stack.push(Integer.parseInt(temp));
            }
        }
        int result = stack.peek();
        return result;
    }
}
