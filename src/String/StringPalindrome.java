package String;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "MADAM";
        String revStr = "";

        for(int i=s.length()-1; i>=0; i--) {
            revStr += s.charAt(i);
        }
        if(s.equals(revStr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        // ////////////////////////////////////////

        String s2 = "welcome 45^%$#*^&% to Ja768%&^va";
        s2 = s2.replaceAll("[^a-zA-Z]", "");
        System.out.println(s2);

        // /////////////////////////////////////////

        String s3 = "abcaabcbca";
        char symbol = 'c';
        int counter = 0;

        for(int i = 0; i<=s3.length()-1; i++) {
            if(s3.charAt(i) == symbol) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
