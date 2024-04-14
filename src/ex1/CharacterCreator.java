package ex1;

class CharacterCreator {
    private CharacterFactory factory;

    void setFactory(CharacterFactory factory) {
        this.factory = factory;
    }

    Character createCharacter(String name) {
        return factory.createCharacter(name);
    }
}