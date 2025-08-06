import java.util.*;

public class StackUsingQueuesDemo {
    static class StackUsingQueues<T> {
        Queue<T> q1 = new LinkedList<>();
        Queue<T> q2 = new LinkedList<>();
        public void push(T x) { q2.add(x); while (!q1.isEmpty()) q2.add(q1.remove()); Queue<T> tmp = q1; q1 = q2; q2 = tmp; }
        public T pop() { return q1.remove(); }
        public T top() { return q1.peek(); }
        public boolean isEmpty() { return q1.isEmpty(); }
    }

    public static void main(String[] args) {
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();
        stack.push(1); stack.push(2); stack.push(3);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
    }
}
