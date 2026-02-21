package arrays;

import java.util.Arrays;

public class FindMissingNumbersInArray {
    public static void main(String[] args) {
        int[] a = {1,4,5,3,7};
        int range = 1;

        Arrays.sort(a);

        for(int i=0; i<=a.length-2; i++) {
            if(a[i] + range != a[i+1]) {
                System.out.println("Missing number is: " + (a[i] + range));
            }
        }
    }
}
