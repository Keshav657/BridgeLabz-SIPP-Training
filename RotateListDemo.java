import java.util.*;

public class RotateListDemo {
    public static <T> void rotateList(List<T> list, int positions) {
        int n = list.size();
        positions = positions % n;
        List<T> rotated = new ArrayList<>(list.subList(positions, n));
        rotated.addAll(list.subList(0, positions));
        for (int i = 0; i < n; i++) list.set(i, rotated.get(i));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        rotateList(list, 2);
        System.out.println("Rotated List: " + list);
    }
}
