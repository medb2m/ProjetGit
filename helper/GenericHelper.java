package helper;

import java.util.List;

public class GenericHelper {



    public  static <T> void showDetails(List<T> array ){
        array.stream().forEach(System.out::println);
    }

}
