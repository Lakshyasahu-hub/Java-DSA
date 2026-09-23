import java.util.Scanner;
public class Accept_txt_frm_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String a = sc.nextLine();
        System.out.println("Enter age");
        int b = sc.nextInt();

        System.out.println("Hello " + a + ", you are " + b + " years old");
    }
}
