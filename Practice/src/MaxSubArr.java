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
        divideConq(arrayOfElements,0,numberOfElements, max);
        System.out.println(max);
    }

    public static int divideConq(int[] arr, int l, int r, int max) {
        if (l<arr.length){
            divideConq(arr,l+1,r,max);
            if (max<sumOfArray(arr,l,r))
            {
                max = sumOfArray(arr,l,r);
            }
        }
        return max;
    }

    public static int sumOfArray(int[] arr, int in, int en){
        int sum = arr[in];
        for (int i = in+1; i < en; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
