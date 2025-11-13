package array;
import java.util.*;

public class reverse_array {
    static void v1(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    static void v2(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        v1(arr);

        // printing the array
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
