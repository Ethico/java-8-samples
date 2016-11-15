import java.util.Optional;

/**
 * Created by hrushikeshp on 11/15/2016.
 */
public class OptionalMain {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hrushi");
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("fallback"));
        optional.ifPresent((s)-> System.out.println("Yo, "+s));
    }
}
