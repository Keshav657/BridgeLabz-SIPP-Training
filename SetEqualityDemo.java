import java.util.*;

public class SetEqualityDemo {
    public static <T> boolean setsEqual(Set<T> s1, Set<T> s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        System.out.println("Sets equal: " + setsEqual(set1, set2));
    }
}
