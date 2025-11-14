package array;
public class missing_number {
    static int v1(int[] arr) {
        int n = 5;
        int sum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : arr)
            arraySum += num;
        return sum - arraySum;
    }
    static int v2(int[] arr) {
        int n = 5;
        int xor1 = 0, xor2 = 0;
        for (int i = 1; i <= n; i++)
            xor1 ^= i;
        for (int num : arr)
            xor2 ^= num;

        return xor1 ^ xor2;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(v2(arr));
    }
}
