package java8.lemdaexpression;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
interface Operation {
    double calculate(double a, double b);
}

public class Example1 {
    static int lenth=10;

    public static void main(String[] args) {
//        List<String>  list = Arrays.asList("Manish","Avisekh","Anil","Sonu","Monu");
//        list.forEach(e-> {
//            lenth = e.length();
//        });

        Operation sum= (a,b) -> {return  a + b;};
        Operation min= (a,b) -> {return  a - b;};
        Operation mul= (a,b) -> {return  a * b;};
        Operation div= (a,b) -> {return  a / b;};


        System.out.println(sum.calculate(10,20));
        System.out.println(min.calculate(10,20));
        System.out.println(mul.calculate(10,20));
        System.out.println(div.calculate(10,20));





    }

//    public static void printValue(Integer i){
//
//    }
}
