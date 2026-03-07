package fromLections.oop;

/*
Method overriding:
1) Possible only in multiple classes (inheritance)
2) We should not change the signature of the method but body we should change
3) Method names are same
4) belongs to INHERITANCE

Method overloading:
1) Possible in single and multiple classes (inheritance)
2) We should change the signature of the method
3) Method names are SAME
4) Belongs to POLYMORPHISM
 */


public class OverridingVsOverloading {
    public static void main(String[] args) {
        XYZ xyz = new XYZ();
        ABC abc = new ABC();

        abc.m1(220.20);
        xyz.m1(100);
    }
}

class ABC {
    public String reverseString(String string) {
        String revStr = "";
        char[] charStr = string.toCharArray();

        for (int i=string.length()-1; i>=0; i--) {
            revStr += charStr[i];
        }
        return revStr;
    }

    public void m1(double salary) {
        System.out.println(salary);
    }
}

class XYZ extends ABC {
    public void m1(int number) { //OVERLOADING
        System.out.println(number);
    }

    public static String m1(String string) { //OVERRIDING
        return string;
    }

    String newString = reverseString("welcome to Java");

}
