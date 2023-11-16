
public class Person implements Nameable {
     int id;
    String name;
      int age;
    boolean parentPermission;
    public Person(int id, String name, boolean parentPermission) {


public class Person {
    private int id;
    private String name;
    private int age;
    private boolean parentPermission;

    public Person(int id, String name, int age, boolean parentPermission) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.parentPermission = parentPermission;
    }

    public Person(int id, int age, boolean parentPermission) {

        this(id, "Unknown", parentPermission);
    }

    public Person(int id, int age) {
        this(id, "Unknown", true);
    }

    public int getId() {
        return id;

        this(id, "Unknown", age, parentPermission);

    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    private boolean ofAge() {

    private boolean isOfAge() {

        return age >= 18;
    }

    public boolean canUseServices() {

        return ofAge() || parentPermission;
    }

    @Override
    public String getCorrectName() {
        return name;

        return isOfAge() || parentPermission;

    }
}