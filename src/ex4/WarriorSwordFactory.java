package ex4;

public class WarriorSwordFactory extends CharacterFactory {
    @Override
    Character createCharacter() {
        return new Character("Warrior", "Warrior", createWeapon(), 100, 50);
    }

    @Override
    Weapon createWeapon() {
        return new Weapon("Sword", 20, 10, 5);
    }
}
