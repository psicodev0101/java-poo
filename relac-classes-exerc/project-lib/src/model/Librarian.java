package model;

public class Librarian {

    private String name;
    private int age;

    public Librarian(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String showInfo () {
        return "Name: " + name + " Age: " + age;
    }

}
