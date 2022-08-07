import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num<=t){
                ht.put(num,i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e: ht.entrySet()) {
            list.add(e.getKey());
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int c = 0;
            for (int k = 0; k < list.size(); k++) {
                if (k!=i){
                    if (list.get(i)+list.get(k)==t){
                        System.out.println(ht.get(list.get(i)) + " " + ht.get(list.get(k)));
                        c = 1;
                    }
                } else {
                    break;
                }
            }
            if(c==1){
                break;
            }
        }
    }
}
