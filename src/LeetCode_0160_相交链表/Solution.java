package LeetCode_0160_相交链表;

/**
 * @Author OliverYu
 * @Date 2019/4/12 10:01
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        int count = 0;
        while (cur1 != null) {
            count++;
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            count--;
            cur2 = cur2.next;
        }

        cur1 = count > 0 ? headA : headB;
        cur2 = cur1 == headA ? headB : headA;
        count = Math.abs(count);

        while (count != 0) {
            count--;
            cur1 = cur1.next;
        }
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
