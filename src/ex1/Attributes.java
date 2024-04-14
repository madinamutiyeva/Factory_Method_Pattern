package ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Attributes {
    private int strength;
    private int agility;
    private int intelligence;
    private int stamina;

    public Attributes() {

    }
}