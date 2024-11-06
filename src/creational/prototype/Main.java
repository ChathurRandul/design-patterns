package creational.prototype;

//  Creates new objects by copying an existing object, typically using a prototype interface.

public class Main {
    public static void main(String[] args) {
        Sheep originalSheep = new Sheep();
        Sheep clonedSheep = (Sheep) originalSheep.clone();
        System.out.println("Original: " + originalSheep);
        System.out.println("Cloned: " + clonedSheep);
    }
}
