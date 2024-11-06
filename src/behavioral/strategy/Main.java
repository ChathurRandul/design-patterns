package behavioral.strategy;

//  Defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern lets the algorithm vary independently from clients that use it.

// Usage
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(500);  // Paid 500 using Credit Card

        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(300);  // Paid 300 using PayPal
    }
}
