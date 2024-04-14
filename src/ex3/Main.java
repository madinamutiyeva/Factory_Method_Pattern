package ex3;

public class Main {
    public static void main(String[] args) {
        FurnitureCreator creator = new FurnitureCreator();

        creator.setFactory(new ModernWoodFactory());
        Chair modernWoodChair = creator.createChair();
        Table modernWoodTable = creator.createTable();
        Sofa modernWoodSofa = creator.createSofa();

        System.out.println("Modern Wood Chair: " + modernWoodChair);
        System.out.println("Modern Wood Table: " + modernWoodTable);
        System.out.println("Modern Wood Sofa: " + modernWoodSofa);

    }
}
