import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfElements = scan.nextInt();
        int[] arrayOfElements = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            arrayOfElements[i] = scan.nextInt();
        }
        mergeSort(arrayOfElements,0,numberOfElements-1);

        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(arrayOfElements[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l<r) {
            int m = (l+r)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int leftS = m-l+1;
        int rightS = r-m;

        int[] lArr = new int[leftS];
        int[] rArr = new int[rightS];

        for (int i = 0; i < leftS; i++) {
            lArr[i] = arr[l+i];
        }
        for (int i = 0; i < rightS; i++) {
            rArr[i] = arr[m+1+i];
        }

        int i, j, k;
        i = 0;
        j = 0;
        k = l;

        while (i<leftS && j<rightS) {
            if (lArr[i]<=rArr[j]){
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i<leftS) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j<rightS) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}
