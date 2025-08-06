import java.util.*;

public class BinaryNumbersQueueDemo {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for (int i = 0; i < N; i++) {
            String curr = queue.remove();
            result.add(curr);
            queue.add(curr + "0");
            queue.add(curr + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Binary Numbers: " + generateBinaryNumbers(5));
    }
}
