import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int[] newN = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum+=nums[j];
            }
            newN[i] = sum;
        }
        System.out.println(Arrays.toString(newN));
    }
}
