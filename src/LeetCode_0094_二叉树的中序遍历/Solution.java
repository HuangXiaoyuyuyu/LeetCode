package LeetCode_0094_二叉树的中序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author OliverYu
 * @Date 2019/4/4 10:10
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

    public static List<Integer> unInOrderRecur(TreeNode head) {
        if (head == null) {
            return new ArrayList<>();
        }
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while (!stack.empty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            }else {
                head = stack.pop();
                list.add(head.val);
                head = head.right;
            }
        }
    return list;
    }
}
