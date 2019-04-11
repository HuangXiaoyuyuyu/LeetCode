package LeetCode_0234_回文链表;

/**
 * @Author OliverYu
 * @Date 2019/4/11 10:00
 * @Email 253757635@qq.com
 * @Description TODO
 */

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head.next;
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();
        while (cur.next != null && cur.next.next != null) {
            fast = fast.next;
            cur = cur.next.next;
        }

        while (fast != null) {
            stack.push(fast);
            fast = fast.next;
        }

        while (!stack.empty()) {
            if (head.val != stack.pop().val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
