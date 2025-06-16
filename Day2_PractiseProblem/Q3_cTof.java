import java.util.*;
public class Q3_cTof {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();
        int farenheit = ((celcius * 9/5) + 32);
        System.out.println("The temperature in farenheit is: "+farenheit);
    }
}
