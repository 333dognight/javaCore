package streamApi.models;

import java.util.List;
import java.util.stream.Collectors;

public class DataCollect {

    DataStore data = new DataStore();

    public String getEvenPrices() {
        List<Integer> prices = data.prices();

        return prices.stream()
                .filter(p -> p % 2 == 0)
                .toList()
                .toString();
    }

    public String getTagsUpperCase() {
        List<String> tags = data.productTags();

        return tags.stream().map(String::toUpperCase).toList().toString();
    }
    public int getSum() {
        List<Integer> prices = data.prices();

        return prices.stream().mapToInt(Integer::intValue).sum();
    }

    public String getClient() {
        List<Client> clients = data.clients();

        return clients.stream()
                .filter(c -> c.getAge() > 40)
                .map(Client::getFirstName)
                .toList()
                .toString();
    }

}
