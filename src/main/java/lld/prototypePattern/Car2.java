package lld.prototypePattern;

public class Car2 implements Cloneable{

    private String name;
    private String color;

    public Car2(String name,String color){
        this.name=name;
        this.color=color;
    }

    @Override
    protected Car2 clone() throws CloneNotSupportedException {
        return (Car2) super.clone();
    }

    @Override
    public String toString() {
        return "Car2{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
