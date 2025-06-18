package Day1_ProgrammingElements;

import java.util.Scanner;
public class Q2_SamAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        
        double average = (maths + physics + chemistry) / 3.0;

        System.out.printf("Sam’s average mark in PCM is %.2f\n", average);
    }
}
