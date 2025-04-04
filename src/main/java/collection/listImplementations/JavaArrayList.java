package collection.listImplementations;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;


class Car{
    private String name;
    private Integer age;
    private Integer price;

    public Car(String name, Integer age, Integer price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getprice() {
        return price;
    }

    public void setprice(Integer price) {
        this.price = price;
    }
}

public class JavaArrayList {
    public static void main(String[] args) {
        List<Integer> copyOnWriteArrayList=new ArrayList<>(
                IntStream.range(0,10).boxed().toList()
        );

        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("sdsd");
        list.add(null);

        System.out.println(list.size());
    }
}
