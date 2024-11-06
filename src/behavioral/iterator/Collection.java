package behavioral.iterator;

import java.util.Iterator;

// Aggregate interface
public interface Collection {
    Iterator<String> createIterator();
}
