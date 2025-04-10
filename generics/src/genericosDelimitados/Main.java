package genericosDelimitados;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        //criamos duas listas, uma para animais e outra para pessoas
        List<Animal> animals = new ArrayList<>();
        List<Person> people = new ArrayList<>();

        //alimentamos a lista de animais
        animals.add(new Animal("bob"));
        animals.add(new Animal("toto"));
        animals.add(new Animal("pipoca"));
        animals.add(new Animal("flor"));

        //alimentamos a lista de pessoas
        people.add(new Person("alex"));
        people.add(new Person("ana"));
        people.add(new Person("jose"));
        people.add(new Person("pedro"));

//        Animal a1 = getFirst(animals);
//        Person p1 = getFirst(people);

//        System.out.println(a1.getName());
//        System.out.println(p1.getName());

        getFirstItemName(animals);
        getFirstItemName(people);
    }

    public static <T extends Entity> void getFirstItemName (List<T> list) {
        //recebe uma lista de qualquer tipo e retorna o primeiro item dessa lista
        System.out.println(list.getFirst().getName());
    }

}
