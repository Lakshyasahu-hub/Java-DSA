import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of units consumed");
        int units = sc.nextInt();
        double amt = 0.0;
        double u100 = 420, u200 = 1020, u400 = 2620;

        if (units > 0 && units <= 100) {
            amt = units * 4.2;
        } else if (units > 100 && units <= 200) {
            amt = u100 + (units - 100) * 6;
        } else if (units > 200 && units <= 400) {
            amt = u200 + (units - 200) * 8;
        } else if (units > 400) {
            amt = u400 + (units - 400) * 13;
        }
        System.out.println("total bill = " + amt);
    }
}
