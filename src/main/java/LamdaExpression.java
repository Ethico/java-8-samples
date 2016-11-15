import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hrushikeshp on 11/15/2016.
 */
public class LamdaExpression {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Hrushi", "Sarang", "Abhi", "Prayag");

        // Method for sorting before java 8
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(names);

        // with lamda expression : in descending order
        Collections.sort(names,(String a,String b)->b.compareTo(a));
        System.out.println(names);

        // java compiler is aware about the type of parameters
        // so we can skip the parameters type.
        Collections.sort(names,(a,b)-> a.compareTo(b));
        System.out.println(names);

    }
}
