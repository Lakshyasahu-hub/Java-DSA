package Do_while;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch;
        String sum, sub, mul, div;
        do {
            System.out.println("Wellcome to Calculator");
            System.out.println("Choose an operation: \n1 - sum\n2 - sub\n3 - mul\n4 - div\n5 - Exit ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter first number");
                    int a = sc.nextInt();
                    System.out.println("Enter second number");
                    int b = sc.nextInt();
                    System.out.println(a + b);
                }
                case 2 -> {
                    System.out.println("Enter first number");
                    int a = sc.nextInt();
                    System.out.println("Enter second number");
                    int b = sc.nextInt();
                    System.out.println(a - b);
                }
                case 3 -> {
                    System.out.println("Enter first number");
                    int a = sc.nextInt();
                    System.out.println("Enter second number");
                    int b = sc.nextInt();
                    System.out.println(a * b);
                }
                case 4 -> {
                    System.out.println("Enter first number");
                    int a = sc.nextInt();
                    System.out.println("Enter second number");
                    int b = sc.nextInt();
                    System.out.println(a / b);
                }
                case 5->{

                }
                default -> {
                    System.out.println("Wrong Input");
                }
            }
            if (ch == 5){
                break;
            }
        }
        while (true);
    }
}
