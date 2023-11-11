public class Main {
    public static void main(String[] args) {
        Person person = new Person(22, "maximilianus", true);
        System.out.println(person.getCorrectName()); // Output: maximilianus

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.getCorrectName()); // Output: MAXIMILIANUS

        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.getCorrectName()); // Output: MAXIMILIAN
    }
}