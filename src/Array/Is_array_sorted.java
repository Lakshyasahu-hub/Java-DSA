package Array;

import java.util.Scanner;

public class Is_array_sorted {
    public static boolean isSorted(int arr[]){
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i-1] > arr[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,3,9};
        System.out.println(isSorted(arr));
    }
}
