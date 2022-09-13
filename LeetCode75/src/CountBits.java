import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CountBits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = countBits(i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
