package Do_while;

import java.util.Scanner;

public class Till_the_number_comes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = 0;
        do {
            a=  ((int) (Math.random() * 100) + 1);
            System.out.println(a);
        }while(a !=100 );
    }
}
