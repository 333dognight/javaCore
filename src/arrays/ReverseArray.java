package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {100, 300, 400, 500, 800, 600};

        for(int i = arr.length - 1; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
