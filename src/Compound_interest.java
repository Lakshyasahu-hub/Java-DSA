import java.util.Scanner;

class Compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal, rate of interest and time");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double CI = p * Math.pow((1 + (r / 100)), t);
        System.out.println(CI);

    }
}
