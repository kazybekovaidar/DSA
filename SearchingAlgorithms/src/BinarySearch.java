import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 1 -- 4
        int target = scan.nextInt(); // 1 -- 4
        int[] arr = new int[n]; // 1 -- 4
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt(); // n -- 4*n
        }
        Arrays.sort(arr);
        System.out.println("x = " + binarySearch(arr,target));
    }

    public static int binarySearch(int[] nums, int target){
       int size = nums.length; // 1 -- 4
       int left = 0; // 1 -- 4
       int right = size-1; // 1 -- 4
       while (left<right){
           int mid = left+(right-left)/2;
           if (nums[mid]==target){
               return mid;
           }
           if (nums[mid]<target) {
               left = mid+1;
           } else {
               right = mid-1;
           }
       }
       return -1;
    }
}


// 1 3 5 7 9 11 -- 3
// 1 3 5
// 7 8 11