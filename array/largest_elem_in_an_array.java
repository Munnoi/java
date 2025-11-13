package array;
import java.util.*;

public class largest_elem_in_an_array {
    static int v1(Integer[] arr) {
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }
    static int v2(Integer[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    static int v3(Integer[] arr) {
        int max = Collections.max(Arrays.asList(arr));
        return max;
    }
    public static void main(String[] args) {
        Integer[] arr = {10, 25, 3, 89, 45};
        System.out.println("Largest element in the array is " + v3(arr));
    }
}
