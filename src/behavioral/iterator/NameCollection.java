package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Concrete collection
public class NameCollection implements Collection {
    private List<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    @Override
    public Iterator<String> createIterator() {
        return names.iterator();
    }
}
