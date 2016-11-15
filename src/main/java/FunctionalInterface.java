/**
 * Created by hrushikeshp on 11/15/2016.
 */
public class FunctionalInterface {
    public static void main(String[] args) {
        // Lamda expression : simple
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("10");
        System.out.println(converted);

        // Lamda expression : static method reference
        Converter<String, Integer> myConverter = Integer::valueOf;
        Integer myConverted = myConverter.convert("20");
        System.out.println(myConverted);

        // Lamda expression : instance method reference
        Util util= new Util();
        Converter<String,String> anotherConverter = util::startsWith;
        String anotherString=anotherConverter.convert("Hrushikesh");
        System.out.println(anotherString);

        // Lamda expression : constructor reference
        PersonFactory<Person> factory= Person::new;
        Person hrushi =factory.createPerson("hrushikesh","Padwal");
        System.out.println(hrushi);
    }
}

class Util{
    String startsWith(String s){
        return String.valueOf(s.charAt(0));
    }
}

class Person{
    String firstName;
    String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

interface PersonFactory<P>{
    P createPerson(String firstname, String lastname);
}
