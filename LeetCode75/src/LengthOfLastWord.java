import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s  = s.trim();
        if (s.indexOf(' ')==-1){
            System.out.println(s.length());
        }
        int i = s.length()-1;
        int count = 0;
        while (s.charAt(i)!=' '){
            count++;
            i--;
        }
        System.out.println(count);
    }
}
