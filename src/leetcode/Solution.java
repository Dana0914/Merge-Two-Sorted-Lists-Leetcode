package leetcode;

public class Solution {
    public static void main(String[] args) {
        ListNode head;
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        ListNode head2;
        head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        System.out.println(mergeTwoLists(head, head2));
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prevNode = new ListNode();
        ListNode prev = prevNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = new ListNode(list1.val, list1 = list1.next);
            } else {
                prev.next = new ListNode(list2.val, list2 = list2.next);
            }
            prev = prev.next;
        }
        prev.next = list1 != null ? list1 : list2;
        return prevNode.next;
    }

}
