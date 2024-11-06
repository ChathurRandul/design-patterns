package structural.decorator;

// Concrete component
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}