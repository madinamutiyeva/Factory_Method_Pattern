package ex4;

public class MageStaffFactory extends CharacterFactory {
    @Override
    Character createCharacter() {
        return new Character("Mage", "Mage", createWeapon(), 80, 100);
    }

    @Override
    Weapon createWeapon() {
        return new Weapon("Staff", 10, 15, 8);
    }
}
