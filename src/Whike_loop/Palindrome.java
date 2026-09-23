package Whike_loop;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        int rev = 0;
        int temp = n;

        while (n != 0){
            int lastDigit = n%10;
            rev = rev *10 + lastDigit;
            n = n/10;
        }
        n = temp;
        System.out.println(rev == n? "Palindrone" : "Not a Palindrome");
    }
}
