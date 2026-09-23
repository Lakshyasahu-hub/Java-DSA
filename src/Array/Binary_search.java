package Array;
import java.util.Scanner;
import java.util.Arrays;
public class Binary_search {
    public static int BinSearch(int arr[],int key){
        int start = 0 ,end = arr.length-1;
        while (start <= end){
            int mid = (start + end) /2;
            if (arr[mid] == key )
                return mid;
            if (arr[mid] > key)
                end = mid-1;
            else
                start = mid +1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner (System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter key");
        int key = sc.nextInt();
        System.out.print("Found key at index : ");
        System.out.println(BinSearch(arr,key));
    }
}
