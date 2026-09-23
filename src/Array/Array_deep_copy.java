package Array;

import java.util.Arrays;

public class Array_deep_copy {
    public static void main(String[] args) {

        int arr[] = {4,5,6,7};
        int copy[] = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println(Arrays.toString(copy));
    }
}
