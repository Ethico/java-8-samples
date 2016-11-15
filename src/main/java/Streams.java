import java.util.*;

/**
 * Created by hrushikeshp on 11/15/2016.
 */
public class Streams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("hrushi");
        names.add("sarang");
        names.add("abhi");
        names.add("prayag");
        names.add("anu");
        names.add("rahi");

        // Streams examples
        System.out.println(names.stream().filter((s) -> s.startsWith("a")).count());

        System.out.println("-------------------------------------------------");

        names.stream()
                .filter((s) -> s.contains("a"))
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------");


        names.stream()
                .map((s) -> s.toUpperCase())
                .filter((s)->s.contains("A"))
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        boolean startsWithA=names.stream()
                .anyMatch((s) -> s.startsWith(s));
        System.out.println(startsWithA);

        System.out.println("-------------------------------------------------");

        Optional<String> allNames=names.stream()
                .sorted()
                .reduce((a,b)-> a +"#"+ b);
        allNames.ifPresent(System.out::println);

        System.out.println("-------------------------------------------------");

        Map<Integer,String> students = new HashMap<>();
        students.put(1,"hrushi");
        students.put(2,"hrushi_2");
        students.put(3,"hrushi_3");
        students.put(4,"hrushi_4");

        students.keySet().stream().forEach(System.out::println);
        students.values().stream().forEach(System.out::println);

        students.forEach((key,value) -> System.out.println("$"+value));

        System.out.println("-------------------------------------------------");


    }
}
