import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Does the below set of numbers has duplicates?");
        int numberOfElements = scan.nextInt();
        for (int i = 0; i < numberOfElements; i++) {
            int number = scan.nextInt();
            set.add(number);
        }
        boolean res = numberOfElements == set.size();
        System.out.println(res ? "no" : "yes");
    }
}
