import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class isAnagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        String k = String.valueOf(1);
        System.out.println(arrangeAlp(s) + "\n" + arrangeAlp(t));
    }

    public static String arrangeAlp(String s){
        char[] arr = new char[26];
        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i)-97;
            arr[ind] = s.charAt(i);
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=97 && arr[i]<=122){
                str.append(arr[i]);
            }
        }
        return str.toString();
    }
}
