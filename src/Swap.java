import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();

        int t = a;
        a = b;
        b = t;

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

    }
}
