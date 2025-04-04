package collection.listinterface;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(1,4,34,7,2,88,2,555,99));

        // Add new item
        list.add(70);

        // Add at index
        list.add(2,40); // IndexOutOfBound :- When u giving index more than size of list

        // Remove by index
        list.remove(3);

        // remove by value
        list.remove(Integer.valueOf(40));

        // Replace value of list by other values
        list.set(2,67); // IndexOutOfBound :- When u giving index more than size of list

        // Remove duplicate from list
        Set<Integer> set=new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);

        // Reverse By Collection
        Collections.reverse(list);

        // Convert into Array by toArray() method
        Integer[] strArr=list.toArray(new Integer[list.size()]);
//        for(Integer i: strArr) System.out.println(i);


        // Convert into array by using copyOf
//        strArr= Arrays.copyOf(A.toArray(),list.size(),Integer.class);


        // Sublist of List
        List<Integer> subList=list.subList(2,7);
        printItem(subList);

        printItem(list);
    }

    public static void printItem(List<Integer> list){
        System.out.println("===========Start===========");
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("===========End===========");
    }
}
