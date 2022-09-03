import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        long res = binToInt(a)+binToInt(b);
        StringBuilder bin = new StringBuilder();
        while (res>0){
            bin.append(res%2);
            res/=2;
        }
        System.out.println(bin.reverse());
    }
    public static long binToInt(String bin){
        int i = bin.length()-1;
        long decimal = 0;
        int j = 0;
        while (i>=0) {
            decimal+=(bin.charAt(j)-48)*Math.pow(2,i);
            i--;
            j++;
        }
        return decimal;
    }
}
