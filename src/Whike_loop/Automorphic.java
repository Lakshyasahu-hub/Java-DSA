package Whike_loop;

public class Automorphic {
    public static void main(String[] args) {
        int n = 5;
        int temp = n;
        int c = 0;
        while (n != 0) {
            c++;
            n = n / 10;
        }
        n = temp;
        long sq = n * n;
          long lastdigits= sq % (long) Math.pow(10, c);
        System.out.println(lastdigits == n? "Automorphic" : "Not an Automorphic Number");
    }
}
