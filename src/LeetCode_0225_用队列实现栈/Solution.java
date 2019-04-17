package LeetCode_0225_用队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author OliverYu
 * @Date 2019/4/17 11:18
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {

    private Queue<Integer> queueData;
    private Queue<Integer> queueHelp;
    /** Initialize your data structure here. */
    public Solution() {
        queueData = new LinkedList<>();
        queueHelp = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queueData.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (queueData.isEmpty()) {
            return 0;
        }
        while (queueData.size() != 1) {
            queueHelp.offer(queueData.poll());
        }
        int temp = queueData.poll();
        swap();
        return temp;
    }

    /** Get the top element. */
    public int top() {
        if (queueData.isEmpty()) {
            return 0;
        }
        while (queueData.size() != 1) {
            queueHelp.offer(queueData.poll());
        }
        int temp = queueData.peek();
        queueHelp.offer(queueData.poll());
        swap();
        return temp;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queueData.isEmpty();
    }

    public void swap() {
        Queue queue = queueHelp;
        queueHelp = queueData;
        queueData = queue;
    }
}
