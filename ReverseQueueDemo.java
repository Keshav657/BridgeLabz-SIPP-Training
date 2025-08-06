import java.util.*;

public class ReverseQueueDemo {
    public static <T> void reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) stack.push(queue.remove());
        while (!stack.isEmpty()) queue.add(stack.pop());
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
