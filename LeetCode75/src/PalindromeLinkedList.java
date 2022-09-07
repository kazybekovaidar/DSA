import java.util.Scanner;

public class PalindromeLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
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

//        do {
//            System.out.println(list.val);
//            list = list.next;
//        } while (list.next != null);
//        System.out.println(list.val);
        System.out.println(isPalindrome(list));
    }

    public static boolean isPalindrome(ListNode head) {
        int c = 0;
        ListNode first = head;
        do {
            c++;
            first = first.next;
        } while (first.next != null);
        c += 1;
        StringBuilder f = new StringBuilder();
        StringBuilder s = new StringBuilder();
        if (c % 2 != 0) {
            for (int i = 0; i < c / 2; i++) {
                f.append(head.val);
                head = head.next;
            }
            head = head.next;
            for (int i = c / 2 + 1; i < c; i++) {
                s.append(head.val);
                head = head.next;
            }
        } else {
            for (int i = 0; i < c / 2; i++) {
                f.append(head.val);
                head = head.next;
            }
            for (int i = c / 2; i < c; i++) {
                s.append(head.val);
                head = head.next;
            }
        }
        System.out.println(f + " " + s);
        return f.toString().equals(s.reverse().toString());
    }
}
