package Queue;

import java.util.Collections;
import java.util.Stack;

class MyQueue {

    Stack<Integer> s1;

    public MyQueue() {
        s1 = new Stack<Integer>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s1.isEmpty())
        {
            return s1.peek();
        }
        return s1.remove(0);
    }

    public int peek() {
        return s1.get(0);
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}