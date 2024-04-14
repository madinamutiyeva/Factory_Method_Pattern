package ex1;

public class Main {
    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();
        creator.setFactory(new WarriorFactory());
        Character warrior = creator.createCharacter("Warrior Bob");

        creator.setFactory(new MageFactory());
        Character mage = creator.createCharacter("Mage Alice");

        creator.setFactory(new ArcherFactory());
        Character archer = creator.createCharacter("Archer John");
        System.out.println(archer);

    }
}