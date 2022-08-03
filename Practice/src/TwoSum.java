import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int target = scan.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();

        Hashtable<Integer,Integer> table = new Hashtable<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i]<target){
                table.put(i,arr[i]);
            }
        }

    }

    public static int sum(int[] arr) {
        int sum = 0; //
        for (int num: arr) {
            sum+=num;
        }
        return sum;
    }
}
