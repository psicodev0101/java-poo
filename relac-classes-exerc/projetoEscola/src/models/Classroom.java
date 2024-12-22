package models;

import java.util.ArrayList;

public class Classroom {

    private String name;
    private Teacher teacher;
    private final ArrayList<Student> students;
    private Diary diary;

    public Classroom(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        diary = new Diary();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
    public void showInfo (){
        System.out.println("Name: " + name);
        System.out.println("Teacher: " + teacher.showInfo());
        System.out.println("Students list: ");
        for (Student student : students) {
            System.out.println(student.showInfo());
        }
    }

    public void recordDiary(String activity) {
        diary.recordActivity(activity);
    }

}
