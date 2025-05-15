import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter a number");
        System.out.println("enter a number");
        num1 = in.nextInt();
        System.out.println("enter another number");
        num2 = in.nextInt();
        System.out.println(divisible(num1,num2));
        for (int i = 0; i < 21; i++) {
            System.out.println("drhydehjh");
        }
    }

    public static String divisible(int num1, int num2) {
        if (num2 % num1 == 0) {
            return "this is divisible";

        } else {
            return "this isn't divisible";
        }
    }

}
