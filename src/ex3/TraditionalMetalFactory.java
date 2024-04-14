package ex3;

public class TraditionalMetalFactory extends FurnitureFactory {
    @Override
    Chair createChair() {
        return new Chair("Traditional Metal Chair", "Traditional", "Metal", 100.0f);
    }

    @Override
    Table createTable() {
        return new Table("Traditional Metal Table", "Traditional", "Metal", 250.0f);
    }

    @Override
    Sofa createSofa() {
        return new Sofa("Traditional Metal Sofa", "Traditional", "Metal", 450.0f);
    }
}
