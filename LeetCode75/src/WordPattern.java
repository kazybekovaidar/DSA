import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class WordPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pattern = scan.next();
        scan.nextLine();
        String s = scan.nextLine();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' '){
                word.append(s.charAt(i));
            } else {
                list.add(word.toString());
                word = new StringBuilder("");
            }
        }
        list.add(word.toString());
        Hashtable<Character, String> hashtable = new Hashtable<>();
        boolean nice = true;
        for (int i = 0; i < pattern.length(); i++) {

            if (hashtable.get(pattern.charAt(i))==null) {
                hashtable.put(pattern.charAt(i),list.get(i));
            } else {
                System.out.println(false);
                break;
            }
        }
        System.out.println(nice);
    }
}
