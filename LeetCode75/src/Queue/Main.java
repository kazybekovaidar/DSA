package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        stack.push(8);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(7);
        queue.add(8);

        System.out.println("Stack " + stack);
        System.out.println("Queue " + queue);

        System.out.println(stack.remove(0));

        //stack peeking
        System.out.print("Peeking element from stack " + stack.peek() + " ");
        System.out.println(stack);
        //queue popping
        System.out.print("Peeking element from queue " + queue.peek() + " ");
        System.out.println(queue);

        //stack popping
        System.out.print("Popping element from stack " + stack.pop() + " ");
        System.out.println(stack);
        //queue popping
        System.out.print("Popping element from queue " + queue.remove() + " ");
        System.out.println(queue);
    }
}
