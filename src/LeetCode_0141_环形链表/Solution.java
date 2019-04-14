package LeetCode_0141_环形链表;

/**
 * @Author OliverYu
 * @Date 2019/4/14 19:32
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

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode fastNode = head.next.next;
        ListNode slowNode = head.next;
        while (fastNode != slowNode) {
            if (fastNode.next == null || fastNode.next.next == null) {
                return false;
            }
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        fastNode = head;
        while (fastNode != slowNode) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        if (fastNode != null) {
            return true;
        }
        return false;
    }
}
