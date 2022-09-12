import java.util.Arrays;
import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String vow = "aeiouAEIOU";
        int countVow = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vow.contains(s.charAt(i)+"")){
                countVow++;
            }
        }
        StringBuilder vowels = new StringBuilder();
        char[] words = new char[s.length()];
        int[] indexes = new int[countVow];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vow.contains(s.charAt(i)+"")){
                vowels.append(s.charAt(i));
                indexes[j] = i;
                j++;
            }
            words[i] = s.charAt(i);
        }
        vowels.reverse();
        String res = vowels.toString();
        j = 0;
        while (j<res.length()) {
            words[indexes[j]] = res.charAt(j);
            j++;
        }
        StringBuilder finalResult = new StringBuilder();
        for (char ch: words) {
            finalResult.append(ch);
        }
        System.out.println(finalResult);
    }
}
