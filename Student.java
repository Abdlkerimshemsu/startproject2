public class Student extends Person {
    private Classroom classroom;

 week_3
    public Student(String name, int age, boolean parent_permission) {
        super(name, age, parent_permission);

    public Student(int id, String name, int age, boolean parentPermission, String classroom) {

        super(id, name, parentPermission);

        super(id, name, age, parentPermission);

        this.classroom = classroom;
 development
    }

    public Classroom getClassroom() {
        return classroom;
    }

 week_3
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}

}


    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}

 development
