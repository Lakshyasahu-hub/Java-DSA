import java.util.Scanner;
class Gender_greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);
        if (gender == 'm' || gender == 'M') {
            System.out.println("Hello, Sir!");
        }
        else if (gender == 'f' || gender == 'F') {
            System.out.println("Hello, Guest!");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
