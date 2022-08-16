public class Main {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        } // Constructor
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node last = new Node(4);

        linkedList.head.next = second;
        second.next = last;
        System.out.println(second.data );
    }
}
