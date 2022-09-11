import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.println(removeElement(nums,3));
    }
    public static int removeElement(int[] nums, int val) {
        int remEl = 0;
        int rem = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                remEl++;
            } else {
                rem++;
            }
        }
        int[] expectedN = new int[remEl];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                expectedN[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < remEl; i++) {
            nums[i] = expectedN[i];
        }
        return nums.length-rem;
    }
}
