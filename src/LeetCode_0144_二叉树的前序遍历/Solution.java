package LeetCode_0144_二叉树的前序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author OliverYu
 * @Date 2019/4/2 10:15
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
    }

    /**
     * (迭代)非递归
     * @param head
     */
    public static List<Integer> unPreOrderRecur(TreeNode head) {
        if (head == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while (!stack.empty()) {
            head = stack.pop();
            list.add(head.val);
            if (head.right != null) {
                stack.push(head.right);
            }
            if (head.left != null) {
                stack.push(head.left);
            }
        }
        return list;
    }
}
