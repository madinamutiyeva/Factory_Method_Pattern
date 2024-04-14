package ex1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WarriorFactory extends CharacterFactory {
    @Override
    Character createCharacter(String name) {
        List<Ability> abilities = Collections.unmodifiableList(Arrays.asList(new Ability("Fireball"), new Ability("Teleport")));
        List<Equipment> equipmentList = Collections.unmodifiableList(Arrays.asList(new Equipment("Staff"), new Equipment("Robe")));
        return new Character(name, new Appearance(), abilities, equipmentList, new Attributes());
    }
}
