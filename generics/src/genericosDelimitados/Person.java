package genericosDelimitados;

public class Person implements Entity{
    private String name;

    public Person (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
