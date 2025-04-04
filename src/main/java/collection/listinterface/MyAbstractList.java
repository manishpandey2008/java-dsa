package collection.listinterface;

import java.util.*;
import java.util.function.Predicate;

public class MyAbstractList {
    public static void main(String[] args) {

//        public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>

        AbstractList<Integer> abstractList=new ArrayList<>();
        abstractList.add(10);
        abstractList.add(20);
        abstractList.add(30);
        abstractList.add(40);
        abstractList.add(50);
        abstractList.add(60);

//        List<Integer> subAbstractList=abstractList.subList(2,6);

//        Iterator<Integer> iterator= abstractList.listIterator(1); // listIterator,iterator,listIterator(index) after index
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        subAbstractList.forEach(System.out::println);
//        System.out.println(subAbstractList.contains(50)); // containsAll(List.of())
//        System.out.println(subAbstractList.remove(50)); // removeAll(List.of())


        AbstractList<Integer> abstractList2=new ArrayList<>();
        abstractList2.add(54);
        abstractList2.add(50);
        abstractList2.add(23);
        abstractList2.add(40);
        abstractList2.add(90);

//        abstractList2.retainAll(abstractList); // abstractList=[10, 20, 30, 40, 50, 60], abstractList2=[50, 40]
//        abstractList.retainAll(abstractList2); //abstractList=[40, 50], abstractList2=[54, 50, 23, 40, 90]
//        System.out.println(abstractList +" "+abstractList2);

//        Predicate<Integer> predicate=i->i>50;
//        abstractList2.removeIf(predicate);
//        System.out.println(abstractList2);


//        abstractList2.spliterator()
//        spliterator() // TODO Not understand

//        abstractList2.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
        abstractList2.sort((a,b)->b-a);


        System.out.println(abstractList2);

    }
}
