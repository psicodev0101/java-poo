package wildcards.extendsWildcards;

import java.util.ArrayList;
import java.util.List;

public class extendsWC {
    public static void main(String[] args) {
        List<Integer> listIntegers = new ArrayList<>();
        listIntegers.add(1);
        listIntegers.add(2);
        listIntegers.add(3);

        List<? extends Number> listNumbers = listIntegers;

        Number intg = listNumbers.get(0);
    }
}
