import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double s1 = 5, s2 = 7, s3 = 9;
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("Area = " + area + " sq units");
    }
}