import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 1
        int[] arr = new int[n]; // 1
        int target = scan.nextInt(); // 1
        int res = -1; // 1
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt(); // n
            if (arr[i]==target){
                res = i;
                break;
            }
        }
        if (res==-1){
            System.out.println("No such element");
        } else {
            System.out.println("x = " + res);
        }
    }
}
