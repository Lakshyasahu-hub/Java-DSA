package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_array_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Mean = " + (double)sum / size);
    }
}
