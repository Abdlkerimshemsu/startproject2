public class Teacher extends Person {

    private String specialization;

 week_3
    public Teacher(String name, int age, boolean parent_permission, String specialization) {

    public Teacher(int id, String name, int age, boolean parentPermission, String specialization) {

        super(id, name, parentPermission);

        super(id, name, age, parentPermission);

        this.specialization = specialization;
    }
 development

        super(name, age, parent_permission);

        this.specialization = specialization;

 week_3



    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    @Override
    public boolean canUseServices() {
        return true;
development
    }

