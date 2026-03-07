package streamApi.models;

public class Main {
    public static void main(String[] args) {
        DataCollect data = new DataCollect();

        System.out.println(data.getEvenPrices());
        System.out.println(data.getTagsUpperCase());
        System.out.println(data.getSum());
        System.out.println(data.getClient());
    }
}
