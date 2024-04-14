package ex3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Furniture {
    private String name;
    private String style;
    private String material;
    private float price;
}
