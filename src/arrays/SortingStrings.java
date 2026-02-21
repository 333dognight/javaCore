package arrays;

import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args) {
        String[] arr = {"Michael", "Andrew", "Marry", "Peter"};

        System.out.println("Before sorting: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
