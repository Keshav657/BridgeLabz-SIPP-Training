import java.util.*;

public class HospitalTriageDemo {
    static class Patient implements Comparable<Patient> {
        String name;
        int severity;
        public Patient(String name, int severity) { this.name = name; this.severity = severity; }
        public int compareTo(Patient other) { return Integer.compare(other.severity, this.severity); }
        public String toString() { return name + " (" + severity + ")"; }
    }

    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
            new Patient("John", 3),
            new Patient("Alice", 5),
            new Patient("Bob", 2)
        );
        PriorityQueue<Patient> pq = new PriorityQueue<>(patients);
        while (!pq.isEmpty()) System.out.println(pq.poll());
    }
}
