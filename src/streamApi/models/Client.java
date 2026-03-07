package streamApi.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Client {
    int id;
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean hasChildren;
}
