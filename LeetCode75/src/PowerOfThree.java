import java.util.ArrayList;
import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        do {
            list.add(pow(3,i));
            i++;
        } while (pow(3,i)<=129140163);
    }
    public static int pow(long n, int k){
        int pow = 1;
        for (int i = 0; i < k; i++) {
            pow*=n;
        }
        return pow;
    }
}
