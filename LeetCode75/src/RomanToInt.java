import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            String roman = scan.next();
            ArrayList<Integer> integers =  new ArrayList<>();
            Hashtable<Character, Integer> rT = new Hashtable<>();

            rT.put('I',1);
            rT.put('V',5);
            rT.put('X',10);
            rT.put('L',50);
            rT.put('C',100);
            rT.put('D',500);
            rT.put('M',1000);

            for (int i = 0; i < roman.length(); i++) {
                integers.add(rT.get(roman.charAt(i)));
            }

            for (int i = 1; i < integers.size(); i++) {
                if (integers.get(i)>integers.get(i-1)){
                    integers.set(i,integers.get(i)-integers.get(i-1));
                }
            }
            int res = 0;
            for (int i = 0; i < integers.size()-1; i++) {
                if (integers.get(i)>=integers.get(i+1)){
                    res+=integers.get(i);
                }
            }
            res+=integers.get(integers.size()-1);
            System.out.println(res);
        }

    }
}
