import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String newS = "";
        String num = "0123456789";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) || num.contains(s.charAt(i)+"")){
                if (Character.isUpperCase(s.charAt(i))){
                    newS+=Character.toLowerCase(s.charAt(i));
                } else {
                    newS+=s.charAt(i);
                }
            }
        }
        StringBuilder reg = new StringBuilder(newS);
        reg = reg.reverse();
        if (reg.toString().equals(newS)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
