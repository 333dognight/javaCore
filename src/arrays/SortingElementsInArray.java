package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsInArray {
    public static void main(String[] args) {
        Integer[] arr = {200, 100, 500, 300, 600};

        System.out.println("Before sorting: " + Arrays.toString(arr));
//        for(int x:arr) {
//            System.out.println(x);
//        }

        //Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder()); // doesn't support primitive data types

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
