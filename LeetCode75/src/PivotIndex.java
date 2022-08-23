import java.util.Scanner;

public class PivotIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        int sum = 0;
        int lS = 0;
        for (int j = 0; j < nums.length; j++) {
            sum+=nums[j];
        }
        boolean fail = false;
        for (int i = 0; i < nums.length; i++) {
            if (lS == sum-lS-nums[i]) {
                System.out.println(i);
                break;
            }
            lS+=nums[i];
        }
    }
}
