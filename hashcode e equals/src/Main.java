public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(01, "Pedro");
        Person person2 = new Person(02, "Joao");
        Person person3 = new Person(02, "Joao");

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        // exibe os hashcodes dos objetos

        System.out.println(person1.equals(person2));
        //compara person1 e person2 (deve resultar false)

        System.out.println(person2.equals(person3));
        //compara person2 e person3 (deve resultar true)
    }
}
