package creational.builder;

//  Separates the construction of a complex object from its representation so that the same construction process can create different representations.

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setFoundation("Concrete")
                .setStructure("Wood")
                .setRoof("Tiles")
                .setFurnished(true)
                .build();
        System.out.println(house);
    }
}
