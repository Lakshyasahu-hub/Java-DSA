package For_Loop;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
        System.out.print(0 + " " + 1 + " ");
        int secondprevious = 0, previous = 1;
        for (int i = 3; i <= n; i++) {
            int current = secondprevious + previous;
            System.out.print(current + " ");
            secondprevious = previous;
            previous = current;
        }
    }
}
