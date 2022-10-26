import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int target = scan.nextInt();
        for (int e: arr) {
            e = scan.nextInt();
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] res = new int[2];
        for(int i = 0; i<size; i++)
        {
            for (int j = 0; j < size; j++) {
                if(i!=j)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        res[0] = i;
                        res[1] = j;
                        break;
                    }
                }
            }
        }
        return res;
    }
}
