package oop;

import java.util.List;

import static oop.ABC.m1;

public class OverridingVsOverloading {
    public static void main(String[] args) {
        XYZ xyz = new XYZ();
        xyz.m1(100);
    }
}

class ABC {
    public static String m1(String string) {
        String revStr = "";
        char[] charStr = string.toCharArray();

        for (int i=string.length()-1; i>=0; i--) {
            revStr += charStr[i];
        }
        return revStr;
    }
}

class XYZ extends ABC {
    public void m1(int number) { //OVERLOADING
        System.out.println(number);
    }

    public static String m1(String string) { //OVERRIDING
        return string;
    }

    public static String numberToString(int num) {
        return String.valueOf(num); // Return a string of the number here!
    }

}
