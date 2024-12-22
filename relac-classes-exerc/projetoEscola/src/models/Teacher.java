package models;

public class Teacher extends Person {

    private Classroom classroom;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void assignClass (Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String showInfo() {
        return super.showInfo();
    }
}
