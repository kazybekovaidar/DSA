import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] set = new char[n];
        for (int i = 0; i < n; i++) {
            set[i] = scan.next().charAt(0);
        }
        int last = n-1;
        for (int i = 0; i < n/2; i++) {
            char temp = set[i];
            set[i] = set[last];
            set[last] = temp;
            last--;
        }
        System.out.println(Arrays.toString(set));
    }
}
