import java.util.ArrayList;
import java.util.Scanner;

public class FirstUniqueChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            arr[index]++;
        }

        int res = -1;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (arr[index] == 1) {
                res = i;
            }
        }
        System.out.println(res);
    }
}

