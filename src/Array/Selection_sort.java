package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest])
                    smallest = j;
            }
                if (i != smallest) {
                    int temp = arr[i];
                    arr[i] = arr[smallest];
                    arr[smallest] = temp;
                }
            }
        System.out.println(Arrays.toString(arr));
    }
}
