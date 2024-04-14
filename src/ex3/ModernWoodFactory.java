package ex3;

public class ModernWoodFactory extends FurnitureFactory {
    @Override
    Chair createChair() {
        return new Chair("Modern Wood Chair", "Modern", "Wood", 150.0f);
    }

    @Override
    Table createTable() {
        return new Table("Modern Wood Table", "Modern", "Wood", 300.0f);
    }

    @Override
    Sofa createSofa() {
        return new Sofa("Modern Wood Sofa", "Modern", "Wood", 500.0f);
    }
}
