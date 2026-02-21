package arrays;

import java.util.Arrays;

public class SortingElementsInArray {
    public static void main(String[] args) {
        int[] arr = {200, 100, 500, 300, 600};

        System.out.println("Before sorting: ");
//        for(int x:arr) {
//            System.out.println(x);
//        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}
