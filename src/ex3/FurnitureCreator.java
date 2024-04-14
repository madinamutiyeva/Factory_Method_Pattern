package ex3;

public class FurnitureCreator {
    private FurnitureFactory factory;

    void setFactory(FurnitureFactory factory) {
        this.factory = factory;
    }

    Chair createChair() {
        return factory.createChair();
    }

    Table createTable() {
        return factory.createTable();
    }

    Sofa createSofa() {
        return factory.createSofa();
    }
}