import java.util.Scanner;

public class NumberOfSegments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0;
        int segment = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count != 0)
                    segment++;
                count = 0;
            }
        }
        if (count > 0) segment++;
        System.out.println(segment);
    }
}
