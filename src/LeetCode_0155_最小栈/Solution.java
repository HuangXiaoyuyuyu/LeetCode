package LeetCode_0155_最小栈;

import java.util.Stack;

/**
 * @Author OliverYu
 * @Date 2019/4/8 10:09
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {

    private Stack<Integer> stackData;
    private Stack<Integer> minStack;

    public Solution() {
        stackData = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.empty()) {
            minStack.push(x);
        }else if (minStack.peek() >= x) {
            minStack.push(x);
        }else {
            int temp = getMin();
            minStack.push(temp);
        }
        stackData.push(x);
    }

    public void pop() {
        if (stackData.empty()) {
            throw new RuntimeException("Stack is empty");
        }
        stackData.pop();
        minStack.pop();
    }

    public int top() {
        if (stackData.empty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stackData.peek();
    }

    public int getMin() {
        if (minStack.empty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }
}
