package helper;

import java.util.List;
import java.util.Objects;

public class GenericHelper {



    public  static <T> void showDetails(List<T> array ){
        array.stream().forEach(System.out::println);
    }


    public static <T> boolean isNull ( T item){

        return Objects.isNull(item);
    }

}
