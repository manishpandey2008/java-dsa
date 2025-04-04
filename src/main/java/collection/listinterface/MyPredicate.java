package collection.listinterface;

import java.util.function.Predicate;

public class MyPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate=(i)->i<10;
        System.out.println(predicate.test(20));
        Predicate<Integer> predicate2=(i)->i>4;
        System.out.println(predicate.and(predicate2).test(2));
        System.out.println(predicate.and(predicate2).negate().test(2));
    }
}
