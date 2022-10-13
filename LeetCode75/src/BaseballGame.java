import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ste = new String[4];
        ArrayList<String> str = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < ste.length; i++) {
            ste[i] = scan.next();
            if (findWords(ste[i])) {
                str.add(ste[i]);
            }
        }
        String[] res = new String[str.size()];
        for (int i = 0; i < str.size(); i++) {
            res[i] = str.get(i);
        }
        System.out.println(Arrays.toString(res));
    }

    public static boolean findWords(String words) {
        String firstR = "QWERTYUIOPqwertyuiop";
        String secondR = "ASDFGHJKLasdfghjkl";
        String thirdR = "ZXCVBNMzxcvbnm";
        if (firstR.contains(words.charAt(0)+"")) {
            for (int i = 1; i < words.length(); i++) {
                if (!firstR.contains(words.charAt(i)+"")) {
                    return false;
                }
            }
        }
        if (secondR.contains(words.charAt(0)+"")) {
            for (int i = 1; i < words.length(); i++) {
                if (!secondR.contains(words.charAt(i)+"")) {
                    return false;
                }
            }
        }
        if (thirdR.contains(words.charAt(0)+"")) {
            for (int i = 1; i < words.length(); i++) {
                if (!thirdR.contains(words.charAt(i)+"")) {
                    return false;
                }
            }
        }
        return true;
    }
}
