package arrays;

public class NumberOfRepetations {
    public void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 10, 20};
        int element = 30;
        int count = 0;

        for(int x : arr) {
            if(x == element) {
                count++;
            }
        }
        System.out.println("Number of repetations:" + count);
    }
}
