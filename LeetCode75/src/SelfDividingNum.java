import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelfDividingNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int l = scan.nextInt();
//        List<Integer> le = new ArrayList<>();
//        int r = scan.nextInt();
//        for (int i = l; i <= r; i++) {
//            if(selfD(i)) System.out.print(i + " ");
//        }

        String s = scan.next();
        String up = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        String down = "qwertyuioplkjhgfdsazxcvbnm";
        if (down.contains(s)) {
            System.out.println(false);
        }
    }
    public static boolean selfD(int n) {
        int k = n;
        while (k>0) {
            int dig = k%10;
            if (dig==0) return false;
            if (n%dig!=0) return false;
            k/=10;
        }
        return true;
    }
}
