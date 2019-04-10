package LeetCode_0098_验证二叉搜索树;

import java.util.Stack;

/**
 * @Author OliverYu
 * @Date 2019/4/10 10:24
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

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        long temp = Long.MIN_VALUE;
        while (!stack.empty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                if (temp >= root.val) {
                    return false;
                }else {
                    temp = root.val;
                    root = root.right;
                }
            }
        }
        return true;
    }
}
