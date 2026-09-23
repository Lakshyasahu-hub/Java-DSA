package Whike_loop;

public class Sum_of_digits {
    public static void main(String[] args) {
        //Sum of digits till the sum gets in single digit
        int n = 7852;
        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                int lastdigits = n % 10;
                sum += lastdigits;
                n = n / 10;
            }
            n = sum;
        }
            System.out.println(n);
    }
}