import java.util.Scanner;

public class MaxSubArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfElements = scan.nextInt();
        int[] arrayOfElements = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            arrayOfElements[i] = scan.nextInt();
        }
        int max = arrayOfElements[0];
        System.out.println(maxSub(arrayOfElements,0,numberOfElements, max));
    }

    public static int maxSub(int[] arr, int l, int r, int max) {
        if (l<arr.length){
            if (r>=0) {
                if (sumOfArray(arr,l,r)>=max){
                    max = sumOfArray(arr,l,r);
                }
                return maxSub(arr,l,r-1,max);
            }
            return maxSub(arr,l+1,arr.length,max);
        } else {
            return max;
        }
    }

    public static int sumOfArray(int[] arr, int in, int en){
        int sum = arr[in];
        for (int i = in+1; i < en; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
