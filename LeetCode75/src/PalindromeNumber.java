import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        String num = String.valueOf(x);
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        if (num.length()%2!=0) {
            first.append(num.substring(0,num.length()/2));
            second.append(num.substring(num.length()/2+1));
        } else {
            first.append(num.substring(0,num.length()/2));
            second.append(num.substring(num.length()/2));
        }
        second.reverse();
        return first.toString().equals(second.toString());
    }
}
