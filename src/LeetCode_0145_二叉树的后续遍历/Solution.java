package LeetCode_0145_二叉树的后续遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author OliverYu
 * @Date 2019/4/3 9:46
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

    public static List<Integer> unPostOrderRecur(TreeNode head) {
        if (head == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(head);
        while (!stack1.empty()) {
            head = stack1.pop();
            stack2.push(head);
            if (head.left != null) {
                stack1.push(head.left);
            }
            if (head.right != null) {
                stack1.push(head.right);
            }
        }

        while (!stack2.empty()) {
            list.add(stack2.pop().val);
        }
        return list;
    }
}
