import java.util.Arrays;
import java.util.Scanner;

public class TernarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int target = scan.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("x = " + ternarySearch(arr,target));
    }

    public static int ternarySearch(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while (r>=l) {
            int m1 = l+(r-1)/3;
            int m2 = r-(r-1)/3;

            if (nums[m1] == target) {
                return m1;
            }
            if (nums[m2] == target) {
                return m2;
            }

            if (nums[m1] > target) {
                r = m1-1;
            } else if (nums[m2]<target){
                l = m2+1;
            } else {
                l = m1+1;
                r = m2-1;
            }
        }

        return -1;
    }
}
