package ex3;

public class IndustrialGlassFactory extends FurnitureFactory {
@Override
    Chair createChair() {
            return new Chair("Industrial Glass Chair", "Industrial", "Glass", 120.0f);
            }

@Override
    Table createTable() {
            return new Table("Industrial Glass Table", "Industrial", "Glass", 280.0f);
            }

@Override
    Sofa createSofa() {
            return new Sofa("Industrial Glass Sofa", "Industrial", "Glass", 480.0f);
            }
}