package For_Loop;

public class Sum_of_N_natural_no {
    public static void main(String[] args) {
        int n= 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
             sum +=i;
        }
            System.out.println("Sum of the first 5 natural numbers : " + sum);
    }
}
