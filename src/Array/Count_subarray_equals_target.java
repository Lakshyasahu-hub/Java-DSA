package Array;

import java.util.Scanner;

public class Count_subarray_equals_target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target =12;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
