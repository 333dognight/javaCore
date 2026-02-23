package String;

public class ReverseAString {
    public static void main(String[] args) {

        //Approach 1

        String s = "welcome";
        String revStr = "";

        for(int i = s.length()-1; i>=0; i--) {
            revStr += s.charAt(i);
        }
        System.out.println(revStr);

        //Approach 2 - by converting string to array type

        String s2 = "welcome";
        String rev2 = "";

        char a[] = s.toCharArray();

        for (int i = s2.length()-1; i>=0; i--) {
            rev2 += a[i];
        }
        System.out.println(rev2);

        //Approach 3 - using StringBuffer / StringBuilder Class

        String s3 = "Selenide";
        StringBuffer stringBuffer = new StringBuffer(s3);
        StringBuffer revStr2 = stringBuffer.reverse();
        System.out.println(revStr2);

        String s4 = "Java automation";
        StringBuilder stringBuilder = new StringBuilder(s4);
        StringBuilder revStr4 = stringBuilder.reverse();
        System.out.println(revStr4);

    }
}
