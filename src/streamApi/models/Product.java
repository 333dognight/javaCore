package streamApi.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Product {
    String name;
    String category;
    double weight;
    List<String> tags;
    List<Integer> prices;
}
