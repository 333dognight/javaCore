package arrays;

public class SearchingElementInArray {
    public void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int searching_element = 20;

        boolean status = false;

        for (int x : arr) {
            if (x == searching_element) {
                System.out.println("Element found");
                status = true;
                break;
            }
        }
        if(!status) {
            System.out.println("Element not found");
        }
    }
}
