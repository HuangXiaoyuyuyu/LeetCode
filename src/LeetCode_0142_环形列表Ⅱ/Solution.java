package LeetCode_0142_环形列表Ⅱ;

/**
 * @Author OliverYu
 * @Date 2019/4/15 10:05
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

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        ListNode fastNode = head.next.next;
        ListNode slowNode = head.next;
        while (fastNode != slowNode) {
            if (fastNode.next == null || fastNode.next.next == null) {
                return null;
            }
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        fastNode = head;
        while (fastNode != slowNode) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        return fastNode;
    }
}
