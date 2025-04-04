package java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{3,4,7,3,4,5};
        List<Integer> list= Arrays.asList(arr);
        System.out.println(list.add(65));
    }
}
