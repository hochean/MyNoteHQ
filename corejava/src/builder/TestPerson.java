package builder;

/**
 * @author HaoQ
 */
public class TestPerson {

    public static void main(String[] args) {
        Person person = Person.builder().age("1").name("a").build();
        System.out.println(person.getName());
    }
}
