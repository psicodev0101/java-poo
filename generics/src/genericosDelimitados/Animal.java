package genericosDelimitados;

public class Animal implements Entity {
    private String name;

    public Animal (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
