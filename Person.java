public class Person implements Nameable {
     int id;
    String name;
      int age;
    boolean parentPermission;
    public Person(int id, String name, boolean parentPermission) {
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

    public void setAge(int age) {
        this.age = age;
    }

    private boolean ofAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return ofAge() || parentPermission;
    }

    @Override
    public String getCorrectName() {
        return name;
    }
}