package ex1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArcherFactory extends CharacterFactory {
    @Override
    Character createCharacter(String name) {
        List<Ability> abilities = Collections.unmodifiableList(Arrays.asList(new Ability("Shoot"), new Ability("Dodge")));
        return new Character(name, new Appearance(), abilities, List.of(new Equipment("Bow"), new Equipment("Arrows")), new Attributes());
    }
}