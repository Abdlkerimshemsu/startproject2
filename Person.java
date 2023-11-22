 week_3
import java.util.ArrayList;
import java.util.List;

public class Person implements Nameable  {
    int id;


    String name;

    int age;

    boolean parent_permission;


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
 development


    public Person(String name, int age, boolean parent_permission) {
        this.id = (int) (Math.random() * 1000000);
        this.name = name;
        this.age = age;
        this.parent_permission = parent_permission;
    }

    public int getId() {
        return id;

        this(id, "Unknown", age, parentPermission);

    }

    public String getName() {
        return name;
    }

 week_3


    public int getAge() {
        return age;
    }


 development
    public void setName(String name) {
        this.name = name;
    }
 week_3


 development
    public int getAge() {
        return age;
    }
 week_3


development
    public void setAge(int age) {
        this.age = age;
    }

 week_3
    public boolean isParentPermission() {
        return parent_permission;
    }

    public void setParentPermission(boolean parent_permission) {
        this.parent_permission = parent_permission;


    private boolean ofAge() {

    private boolean isOfAge() {

        return age >= 18;
    }

    public boolean canUseServices() {
return ofAge() || parentPermission;
 development
    }
        
    public String correct_name() {
        return name;

        return isOfAge() || parentPermission;

    }
}
