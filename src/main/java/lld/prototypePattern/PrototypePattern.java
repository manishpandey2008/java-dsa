package lld.prototypePattern;

public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
//        The Prototype Pattern is a creational design pattern used when the cost of creating a new object is prohibitively expensive or complex.
//        Instead of creating new instances of a class every time, the prototype pattern involves creating new objects by copying (or cloning) an existing instance
//        Car car1=new Car("BMW","Red");
//        Car car2=car1.clone();
//        Car car3=new Car("BMW","Red");
//        System.out.println(car1.hashCode());
//        System.out.println(car2.hashCode());


        Car2 car1=new Car2("BMW","Red");
        Car2 car2=car1.clone();
        Car2 car3=new Car2("BMW","Red");
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

    }
}
