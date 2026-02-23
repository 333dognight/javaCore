package String;

import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String[] args) {
        int[] a = {20,40,60,30,50}; //mutable
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println(Arrays.toString(a)); //array has been changed after sorting

        String s = "welcome"; //immutable
        System.out.println(s);
        s.concat("to java");
        System.out.println(s); //nothing has changed because String (and only String) is immutable

    }
}
