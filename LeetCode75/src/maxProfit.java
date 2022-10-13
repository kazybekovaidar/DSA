import java.util.Scanner;

public class maxProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] prices = new int[n];
        for (int i=0; i<n; i++)
        {
            prices[i] = scan.nextInt();
        }
        System.out.println(profit(prices));
    }

    public static int profit(int[] prices)
    {
        int size = prices.length;
        int count = 0;
        for(int i=0; i<size-1; i++)
        {
            if(prices[i]>=prices[i+1])
            {
                count++;
            }
        }
        if(count == size-1) return 0;
        int min = prices[0];
        int prof = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            int dif = price - min;
            prof = Math.max(prof, dif);
        }
        return prof;
    }
}
