package ex4;

public class CharacterCreator {
    private CharacterFactory factory;

    void setFactory(CharacterFactory factory) {
        this.factory = factory;
    }

    Character createCharacter() {
        return factory.createCharacter();
    }

    Weapon createWeapon() {
        return factory.createWeapon();
    }
}