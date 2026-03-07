package streamApi.models;

import lombok.Getter;

import java.util.List;

@Getter
public class DataStore {

    public List<Integer> prices() {
        return List.of(
                100, 101, 200, 202, 208, 211
        );
    }

    public List<String> productTags() {
        return List.of(
                "cheap", "expensive", "affordable", "on sale", "from partner"
        );
    }

    public List<Client> clients() {
        return List.of(
                Client.builder()
                        .id(101)
                        .firstName("Dmitry")
                        .lastName("Raskalov")
                        .age(35)
                        .salary(60700.00)
                        .hasChildren(false)
                        .build(),
                Client.builder()
                        .id(102)
                        .firstName("Dmitry")
                        .lastName("Miller")
                        .age(44)
                        .salary(120500.00)
                        .hasChildren(false)
                        .build(),
                Client.builder()
                        .id(103)
                        .firstName("Richard")
                        .lastName("Hammond")
                        .age(30)
                        .salary(330000.30)
                        .hasChildren(true)
                        .build(),
                Client.builder()
                        .id(104)
                        .firstName("James")
                        .lastName("Miller")
                        .age(38)
                        .salary(220000.00)
                        .hasChildren(true)
                        .build(),
                Client.builder()
                        .id(105)
                        .firstName("Jeremy")
                        .lastName("Clarkson")
                        .age(44)
                        .salary(470800.00)
                        .hasChildren(true)
                        .build()
        );
    }

}
