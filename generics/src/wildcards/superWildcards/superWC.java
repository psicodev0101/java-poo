package wildcards.superWildcards;

import java.util.ArrayList;
import java.util.List;

public class superWC {
    public static void main(String[] args) {
        //criando uma lista de Integer
        List<Integer> listInt = new ArrayList<>();
        //alimentando a lista
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);

        //imprimindo a lista
        printList(listInt);
    }

    public static void printList (List<? super Integer> list) {
    //recebe uma lista de Integer ou superior e imprime o conteudo
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
