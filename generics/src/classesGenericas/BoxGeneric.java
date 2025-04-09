package classesGenericas;

import java.util.ArrayList;
import java.util.List;

public class BoxGeneric <T>{
    private List<T> content = new ArrayList<>();

    public void add (T item) {
        content.add(item);
    }

    public T getFirst() {
        return content.getFirst();
    }
}
