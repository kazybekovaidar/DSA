import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        arr = selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int minInd = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[minInd]){
                    minInd = j;
                }
            }
            int temp = nums[minInd];
            nums[minInd] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
