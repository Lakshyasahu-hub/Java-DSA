package Do_while;

import java.util.Scanner;

public class Repeat_Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Hello");
            System.out.println("Press 1 to repeat");
             ch = sc.nextInt();
        }
        while (ch == 1);
    }
}
