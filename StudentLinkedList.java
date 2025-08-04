package Linked_List;

class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedListImpl {
    private StudentNode head;

    // Add at beginning
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int pos, int rollNumber, String name, int age, String grade) {
        if (pos <= 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        StudentNode temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            addAtEnd(rollNumber, name, age, grade);
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Delete by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Search by Roll Number
    public StudentNode searchByRollNumber(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Display all records
    public void displayAll() {
        StudentNode temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Update grade by Roll Number
    public boolean updateGrade(int rollNumber, String newGrade) {
        StudentNode student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
            return true;
        }
        return false;
    }
}

// Demo
public class StudentLinkedList {
    public static void main(String[] args) {
        StudentLinkedListImpl list = new StudentLinkedListImpl();
        list.addAtBeginning(101, "Alice", 20, "A");
        list.addAtEnd(102, "Bob", 21, "B");
        list.addAtPosition(2, 103, "Charlie", 22, "C");
        list.displayAll();

        System.out.println("\nUpdating grade for Roll 102...");
        list.updateGrade(102, "A+");
        list.displayAll();

        System.out.println("\nSearching for Roll 103...");
        StudentNode found = list.searchByRollNumber(103);
        if (found != null) {
            System.out.println("Found: " + found.name + ", Grade: " + found.grade);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nDeleting Roll 101...");
        list.deleteByRollNumber(101);
        list.displayAll();
    }
}
