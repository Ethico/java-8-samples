import java.lang.*;
import java.lang.FunctionalInterface;

/**
 * Created by hrushikeshp on 11/15/2016.
 */
@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
    /*
     With FunctionalInterface annotation, we can not declare
     more than one method in the interface
     T reverseConvert(F from);
    */
    /*
        With functionalInterface annotation, we can define multiple
        default methods in functional interface.
     */
    default F tempConvert(F from){
        return  from;
    }

}
