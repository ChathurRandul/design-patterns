package behavioral.iterator;

//  Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

import java.util.Iterator;

// Usage
public class Main {
    public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection();
        nameCollection.addName("Alice");
        nameCollection.addName("Bob");
        nameCollection.addName("Charlie");

        Iterator<String> iterator = nameCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println("Name: " + iterator.next());
        }
    }
}
