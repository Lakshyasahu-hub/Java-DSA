package Whike_loop;

public class Strong_Number {
    public static void main(String[] args) {
        int n = 145;
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int lastdigit = n % 10;
            int fact = 1;
            for (int i = 1; i <= lastdigit; i++) {
                fact *= i;
            }
            sum += fact;
            n =n/10;
        }
         n=temp;
        System.out.println(sum == n? "Strong number" : "Not a Strong Number");
    }
}
