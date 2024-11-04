import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue {
    private Queue<Character> queue = new LinkedList<Character>();

    public void enqueue(Character c) {
        queue.add(c);
    }

    public Character dequeue() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}