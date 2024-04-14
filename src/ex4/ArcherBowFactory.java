package ex4;

public class ArcherBowFactory extends CharacterFactory {
    @Override
    Character createCharacter() {
        return new Character("Archer", "Archer", createWeapon(), 90, 70);
    }

    @Override
    Weapon createWeapon() {
        return new Weapon("Bow", 15, 12, 10);
    }
}
