package ex4;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Character {
    private String name;
    private String characterClass;
    private Weapon weapon;
    private int health;
    private int mana;
}
