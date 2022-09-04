import java.util.Scanner;

public class SearchIns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int size = nums.length;
        if (target>nums[size-1]) {
            return size;
        }
        if (target<nums[0]){
            return 0;
        }
        int left = 0;
        int right = size-1;
        while (true) {
            int mid = left+(right-left)/2;
            if (target==nums[mid]){
                return mid;
            } else if (target>nums[mid]){
                left = mid+1;
                if (target<nums[mid+1]){
                    return mid+1;
                }
            } else if (target<nums[mid]){
                right = mid-1;
                if (target>nums[mid-1]) {
                    return mid;
                }
            }
        }
    }
}
