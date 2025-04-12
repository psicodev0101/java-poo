package classesGenericas;

import java.util.ArrayList;
import java.util.List;

public class BoxInteger {
    private List<Integer> content = new ArrayList<>();

    public void add (Integer number) {
        content.add(number);
    }

    public Integer getFirst() {
        return content.getFirst();
    }
}
