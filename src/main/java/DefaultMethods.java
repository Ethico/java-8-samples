/**
 * Created by hrushikeshp on 11/15/2016.
 */
public class DefaultMethods {
    public static void main(String[] args) {
        // Before java 8 : annoymous class
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return a*a;
            }
            // Overriding default method of an interface
            @Override
            public double squareRoot(int a) {
                return a/2;
            }
        };
        // Before java 8 : annoymous class
        System.out.println(formula.calculate(10));
        System.out.println(formula.squareRoot(100));
    }
}

interface Formula{
    double calculate(int a);
    // Java 8 new feature : default method
    default double squareRoot(int a){
        return Math.sqrt(a);
    }
}
