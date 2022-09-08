import java.util.Scanner;

public class addDig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String k = String.valueOf(num);
        while(k.length()!=1) {
            int sum = 0;
            while(num>0) {
                sum+=num%10;
                num/=10;
            }
            num = sum;
            k = String.valueOf(num);
        }
        System.out.println(Integer.parseInt(k));
    }
}
