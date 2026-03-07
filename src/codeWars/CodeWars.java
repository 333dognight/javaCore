package codeWars;

public class CodeWars {
    public int solution(int number) {
        int numOne = 3;
        int numTwo = 5;
        int sum = 0;

        for (int i=0; i<number; i++) {
            if (i % numOne == 0 || i % numTwo == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int getCount(String str) {
        int count = 0;
        char[] strChar = str.toCharArray();

        for(int i=0; i<str.length(); i++) {
            for (char c : strChar) {
                if (str.charAt(i) == c) {
                    count += 1;
                }
            }
        }
        //return count;

        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }
}
