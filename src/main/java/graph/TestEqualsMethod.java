package graph;



import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TestEqualsMethod {

    public static class Person{
        String name;
        Integer age;

        public Person(String name,Integer age){
            this.name=name;
            this.age=age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(age, person.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name,age);
        }
    }

    public static void main(String[] args) {

        Person p1= new Person("Manish",20);
        Person p2=new Person("Manish",20);
        Person p3=new Person("Pandey",21);

        Map<Person,Integer> map=new HashMap<>();
        map.put(p1,10);
        map.put(p2,10);
        map.put(p3,30);

        System.out.println(map.size());
    }
}
