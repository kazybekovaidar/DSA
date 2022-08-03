import java.util.LinkedList;
import java.util.Queue;

public class MainClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(12);
        queue.add(50);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

    }
}
