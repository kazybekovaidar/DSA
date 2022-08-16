import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String equation = scan.next();
        ArrayList<Double> aNums = new ArrayList<>();
        ArrayList<Character> aSigns = new ArrayList<>();
        ArrayList<Double> bNums = new ArrayList<>();
        ArrayList<Character> bSigns = new ArrayList<>();
        String aPart = equation.substring(0, equation.indexOf("=") + 1);
        String bPart = equation.substring(equation.indexOf("=") + 1, equation.length()) + "=";

        arrange(aPart, aNums, aSigns);
        arrange(bPart, bNums, bSigns);
        //first part of the equation
        operation(aNums, aSigns, '*');
        operation(aNums, aSigns, '/');
        operation(aNums, aSigns, '+');
        operation(aNums, aSigns, '-');
        //second part of the equation
        operation(bNums, bSigns, '*');
        operation(bNums, bSigns, '/');
        operation(bNums, bSigns, '+');
        operation(bNums, bSigns, '-');
        if (Objects.equals(aNums.get(0), bNums.get(0))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static void arrange(String part, ArrayList<Double> nums, ArrayList<Character> signs) {
        StringBuilder number = new StringBuilder();
        String digits = "0123456789";
        for (int i = 0; i < part.length(); i++) {
            if (digits.contains(part.charAt(i) + "")) {
                number.append(part.charAt(i));
            } else {
                nums.add(Double.parseDouble(number.toString()));
                signs.add(part.charAt(i));
                number = new StringBuilder();
            }
        }
    }

    static ArrayList operation(ArrayList<Double> nums, ArrayList<Character> signs, char sign) {
        int i = 0;
        while (signs.get(i) != '=') {
            if (signs.get(i) == sign) {
                switch (sign) {
                    case '*': nums.set(i, nums.get(i) * nums.get(i + 1));break;
                    case '/': nums.set(i, nums.get(i) / nums.get(i + 1));break;
                    case '+': nums.set(i, nums.get(i) + nums.get(i + 1));break;
                    case '-': nums.set(i, nums.get(i) - nums.get(i + 1));break;
                }
                nums.remove(i + 1);
                signs.remove(i);
            } else {
                i++;
            }
        }
        return nums;
    }
}