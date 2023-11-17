import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom("bio");
        Student student1 = new Student("John", 28, true);
        Student student2 = new Student("Alemu", 27, false);

        classroom.addStudent(student1);
        classroom.addStudent(student2);

        List<Student> students = classroom.getStudents();
        for (Student student : students) {
            System.out.println(student.getName());
        }

        Book book = new Book("oop", "m. murad");
        Person person = new Person("alex", 30, false);

        Rental rental = new Rental(book, person);
        System.out.println(rental.getBook().getTitle());
        System.out.println(rental.getPerson().getName());
    }
}
