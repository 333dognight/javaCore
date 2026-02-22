package String;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "welcome";
        String s2 = "to java";
        String s3 = "automation";

        System.out.println(s1 + s2 + s3);
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.concat(s2 + s3));

        String s4 = "   welcome   ";

        System.out.println(s4.trim());

        //charAt - returns character from a string based on index

        //contains - return true/false

        System.out.println(s1.contains("wel")); //true
        System.out.println(s1.contains("Wel")); //false
        System.out.println(s1.contains("welme")); //false

        //equals(), equalsIgnoreCase() - compare strings

        //replace() - replace single/multiple (sequence) of characters in a string
        //'' not allowed for empty, only ""
        String s = "welcome to java selenium, python selenium, c# selenium";
        System.out.println(s.replace('e', 'X'));
        System.out.println(s.replace("selenium", "Selenide"));

        //substring() - extract substring from the string
        s = "Selenium";
        System.out.println(s.substring(1,5)); //elen
        System.out.println(s.substring(0,3)); //Sel

        //split() - split the string into multiple parts on delimeter
        // * % ^ & ( ) - cannot use as delimeter
        s1 = "abc123@gmail.com";

        String a[] = s1.split("@");
        System.out.println(a[0]); //abc123
        System.out.println(a[1]); //gmail.com

        System.out.println(Arrays.toString(a)); //[abc123, gmail.com]

        for(String x:a) {
            System.out.println(x);
        }

        s2 = "abc,123@xyz"; //abc   123   xyz
        String[] arr1 = s2.split(","); //abc, 123@xyz
        String[] arr2 = arr1[1].split("@"); //123, xyz

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

    }
}
