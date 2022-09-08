import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
            if (nums[i]!=0) {
                list.add(nums[i]);
            }
        }
        if (list.size()<n){
            int k = n-list.size();
            while (k>0){
                list.add(0);
                k--;
            }
        } else if (list.size()==0){
            System.out.println(Arrays.toString(nums));
        }
        for (int i = 0; i < n; i++) {
            nums[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nums));

    }
}
