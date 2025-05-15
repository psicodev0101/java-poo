import java.util.Objects;

public class Human implements Comparable<Human> {

    /*simboliza uma pessoa e define o seu nome e a sua idade*/

    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //sobrescrevendo tostring
    @Override
    public String toString() {
        return name + ", " + age + "\n";
    }

    /*definindo criterios de comparacao*/
    @Override
    public int compareTo(Human o) {
        int nameCmp = this.name.compareTo(o.getName());
        /*uma variavel eh criada para armazenar o resultado da comparacao*/
        if (nameCmp != 0) return nameCmp;
        /*se os objetos nao forem iguais, ele compara pela idade abaixo*/
        return Integer.compare(this.age, o.getAge());
    }


}
