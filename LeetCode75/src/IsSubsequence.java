import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        for (int i = 0; i < t.length(); i++) {
            if (s.indexOf(t.charAt(i))==-1){
                t = t.replace(t.charAt(i),' ');
            }
        }
        String newT = "";
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i)!=' '){
                newT+=t.charAt(i);
            }
        }
        System.out.println(newT);
        if (newT.contains(s)) System.out.println(true);
    }
}
