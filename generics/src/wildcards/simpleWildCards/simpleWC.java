package wildcards.simpleWildCards;

import java.util.ArrayList;
import java.util.List;

public class simpleWC {
    public static void main(String[] args) {

        //criando duas listas
        List<String> listStr = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();

        //alimentando listas

        listInt.add(8);
        listInt.add(6);
        listInt.add(2);

        listStr.add("alex");
        listStr.add("bob");
        listStr.add("ana");

        //imprimindo as listas com metodo generico
        printList1(listInt);
        printList1(listStr);

        //usando metodo generico para adicionar itens nas listas
        addInList(listInt, 16);
        addInList(listStr, "mourice");

        //usando metodo wildcard para imprimir listas
        printList3(listInt);
        printList3(listStr);
    }

    //metodo com tipo generico para imprimir lista
    public static <T> void printList1(List<T> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    //usando o tipo generico para adicionar item a uma lista
    public static <T> void addInList(List<T> list, T item) {
        list.add(item); // Agora está certo!
    }

    //usando wildcard em metodo para imprimir lista
    public static void printList3 (List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
