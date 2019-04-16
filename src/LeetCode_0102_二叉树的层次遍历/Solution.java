package LeetCode_0102_二叉树的层次遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author OliverYu
 * @Date 2019/4/16 10:14
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while (count != 0) {
                root = queue.poll();
                list.add(root.val);
                count--;
                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

}
