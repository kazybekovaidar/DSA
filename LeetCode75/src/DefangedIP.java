import java.util.Scanner;

public class DefangedIP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String address = scan.next();
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<address.length(); i++)
        {
            if(address.charAt(i)=='.')
            {
                res.append("[.]");
            } else {
                res.append(address.charAt(i));
            }
        }
        return res.toString();
    }
}
