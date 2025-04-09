package classesGenericas;

import java.util.ArrayList;
import java.util.List;

public class BoxString {
    private List<String> content = new ArrayList<>();

    public void add (String name) {
        content.add(name);
    }

    public String getFirst() {
        return content.getFirst();
    }
}
