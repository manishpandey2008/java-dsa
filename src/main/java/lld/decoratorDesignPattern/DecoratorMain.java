package lld.decoratorDesignPattern;

public class DecoratorMain {
    public static void main(String[] args) {
        BaseInterface baseInterface=new BasePizza();

        baseInterface=new ExtraCheez(baseInterface);
        baseInterface=new ExtraCheez(baseInterface);
        baseInterface=new ExtraItem(baseInterface);
        baseInterface=new ExtraVeg(baseInterface);

        System.out.print(baseInterface.getCost());

    }
}
