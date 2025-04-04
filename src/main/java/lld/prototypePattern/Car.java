package lld.prototypePattern;

public class Car implements CloneInterface<Car>{

    private String name;
    private String color;

    public Car(String name,String color){
        this.name=name;
        this.color=color;
    }

    @Override
    public Car clone() {
        return new Car(this.name,this.color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
