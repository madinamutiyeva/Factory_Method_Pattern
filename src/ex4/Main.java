package ex4;

public class Main {
    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();

        creator.setFactory(new WarriorSwordFactory());
        Character warrior = creator.createCharacter();
        Weapon sword = creator.createWeapon();

        System.out.println("Created character: " + warrior);
        System.out.println("Equipped weapon: " + sword);
    }
}
