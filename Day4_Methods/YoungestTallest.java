import java.util.Scanner;

public class YoungestTallest {

    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int age : ages) {
            if (age < youngest) {
                youngest = age;
            }
        }
        return youngest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];

        System.out.println("Enter ages of Amar, Akbar and Anthony:");
        for (int i = 0; i < 3; i++) {
            ages[i] = scanner.nextInt();
        }

        System.out.println("Enter heights of Amar, Akbar and Anthony (in cm):");
        for (int i = 0; i < 3; i++) {
            heights[i] = scanner.nextInt();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest + " cm");

        scanner.close();
    }
}
