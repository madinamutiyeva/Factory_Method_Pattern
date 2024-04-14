package ex1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class CharacterFactory {
    abstract Character createCharacter(String name);
}
