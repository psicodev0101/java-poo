import models.Classroom;
import models.Student;
import models.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Antonio", 35);
        Classroom classroom1 = new Classroom("101-A", teacher1);
        teacher1.assignClass(classroom1);

        classroom1.addStudent(new Student("Joao", 12));
        classroom1.addStudent(new Student("Maria", 13));
        classroom1.addStudent(new Student("Rogerio", 11));
        classroom1.addStudent(new Student("Eduarda", 14));

        classroom1.recordDiary("English test");
        classroom1.showInfo();
    }
}
