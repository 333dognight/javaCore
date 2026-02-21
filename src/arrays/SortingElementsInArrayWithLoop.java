package arrays;

import java.util.Arrays;

public class SortingElementsInArrayWithLoop {
    public static void main(String[] args) {
        int[] a = {50,20,40,10,100,30,80,70};
        int n = a.length;

        System.out.println("Before sorting: " + Arrays.toString(a));

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting: " + Arrays.toString(a));
    }
}
