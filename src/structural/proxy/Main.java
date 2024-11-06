package structural.proxy;

//  Provides a surrogate or placeholder for another object to control access to it.

// Usage
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        image.display(); // Loading + Displaying
        image.display(); // Only Displaying (no loading)
    }
}
