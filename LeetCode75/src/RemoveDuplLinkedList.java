import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class RemoveDuplLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(4);
        ListNode f = new ListNode(1);
        ListNode s = new ListNode(1);
        ListNode t = new ListNode(1);
        ListNode k = new ListNode(1);
        ListNode l = new ListNode(1);
        ListNode m = new ListNode(4);
        list.next = f;
        f.next = s;
        s.next = t;
        t.next = k;
        k.next = l;
        l.next = m;
        list = list.next;
        System.out.println(list.val);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr!= null && curr.next!=null) {
            if (curr.val==curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
