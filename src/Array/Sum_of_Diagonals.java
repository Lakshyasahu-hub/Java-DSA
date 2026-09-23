package Array;
import java.util.Scanner;
public class Sum_of_Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int left =0,right = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j)
                    left += arr[i][j];
                    if (i+j == arr.length-1)
                        right += arr[i][j];
            }
        }
        System.out.println(left + ", " + right);
    }
}
