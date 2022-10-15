import java.util.Scanner;

public class ComplementOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(bitwiseComplement(n));
    }

    static StringBuilder str = new StringBuilder("");
    public static void bin(int n)
    {
        if(n>1)
            bin(n>>1);
        str.append(n&1);
    }
    public static int bitwiseComplement(int n) {
        bin(n);
        String s = "";
        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i)=='0')
            {
                s+="1";
            } else {
                s+="0";
            }
        }
        return Integer.parseInt(s, 2);
    }
}
