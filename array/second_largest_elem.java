package array;

import java.util.*;

public class second_largest_elem {
    static int v1(Integer[] arr) {
        int max = arr[0];
        int second_max = arr[0];
        
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max) {
                second_max = arr[i];
            }
        return second_max;
    }
    static int v2(Integer[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    static int v3(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        list.sort(Collections.reverseOrder());
        return list.get(1);
    }
    public static void main(String[] args) {
        Integer[] arr = {10, 25, 3, 89, 45};
        System.out.println("Second largest element in the array is " + v3(arr));
    }
}
