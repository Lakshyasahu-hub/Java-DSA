import java.util.Scanner;
public class Valid_voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc. nextInt();

        if (age >= 18) {
            System.out.println("Hello " + name + ", You are a valid voter");
        }
        else {
            System.out.println("Hello " + name + ", You will be eligible to vote in " + (18-age) + " Years");
        }
    }
}
