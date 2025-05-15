import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        /*criando hashset para armazenar os objetos sem repeticao*/
        Set<Human> hashset = new HashSet<>();

        //armazenando dados no hashset
        hashset.add(new Human("pedro", 21));
        hashset.add(new Human("paulo", 22));
        hashset.add(new Human("joao", 23));
        hashset.add(new Human("pedro", 29));
        hashset.add(new Human("joao", 23)); //esse sera descartado

        /*criando treeset para armazenar os objetos sem repeticao*/
        Set<Human> treeset = new TreeSet<>();

        treeset.add(new Human("pedro", 21));
        treeset.add(new Human("paulo", 22));
        treeset.add(new Human("joao", 23));
        treeset.add(new Human("pedro", 29)); //deve aparecer junto ao 1 item

        System.out.println(hashset);
        System.out.println("__________");
        System.out.println(treeset);

    }
}