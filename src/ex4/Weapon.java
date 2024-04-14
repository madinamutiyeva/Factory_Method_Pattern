package ex4;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weapon {
    private String type;
    private int damage;
    private int speed;
    private int range;
}
