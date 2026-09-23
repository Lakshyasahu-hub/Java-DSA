import java.util.Scanner;
public class Accept_and_print_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
    }
}
