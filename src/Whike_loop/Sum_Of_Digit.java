package Whike_loop;

public class Sum_Of_Digit {
    public static void main(String[] args) {
        int sum = 0;
        int n=4554;
        while (n != 0){
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n/10;
        }
        System.out.println(sum);
    }
}
