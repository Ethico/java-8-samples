import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by hrushikeshp on 11/15/2016.
 */
public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        // Built in functional interfaces examples

        // Predicate
        Predicate<String> predicate = (s) -> s.length()>0;
        System.out.println(predicate.test("hrushi"));
        System.out.println(predicate.test(""));

        System.out.println("-----------------------------");

        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("Hrushi"));

        System.out.println("-----------------------------");
        // Functions
        Function<String,Integer> toInteger=Integer::valueOf;
        System.out.println(toInteger.apply("111"));
        Function<String,String> backToString=toInteger.andThen(String::valueOf);
        System.out.println(backToString.apply("1212"));
        System.out.println("-----------------------------");

        // Supplier
        Supplier<Person> personSupplier = Person::new;
        Person newPerson=personSupplier.get();

       // Consumer
        Consumer<Person> greet = (p) -> System.out.println("Hello "+p.firstName);
        greet.accept(new Person("Hrushi", "Padwal"));

        System.out.println("-----------------------------");

        // Comparator
        Comparator<Person> personComparator = (p1,p2) -> p1.firstName.compareTo(p2.firstName);

        Person p1 = new Person("Hrushi","Padwal");
        Person p2 = new Person("Sarang","Padwal");

        System.out.println(personComparator.compare(p1, p2));
        System.out.println(personComparator.reversed().compare(p1,p2));
        System.out.println("-----------------------------");


    }
}



