package array;

public class move_zeros_to_end {
    static void v1(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
    }
    static void v2(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                arr[j++] = arr[i];
        while (j < arr.length)
            arr[j++] = 0;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        v2(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
