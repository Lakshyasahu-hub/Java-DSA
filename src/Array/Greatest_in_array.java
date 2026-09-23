package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Greatest_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,36,4,5};
        int great = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[great]){
                great = i ;
            }
        }
        System.out.println("Greatest = " +arr[great] + " found at "+ great);
    }
}
