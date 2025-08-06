import java.util.*;

public class SymmetricDifferenceDemo {
    public static <T> Set<T> symmetricDifference(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        result.addAll(s2);
        Set<T> tmp = new HashSet<>(s1);
        tmp.retainAll(s2);
        result.removeAll(tmp);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2));
    }
}
