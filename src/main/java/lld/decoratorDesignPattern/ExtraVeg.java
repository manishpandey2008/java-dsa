package lld.decoratorDesignPattern;

public class ExtraVeg extends BaseInterface {
    BaseInterface baseInterface;

    ExtraVeg(BaseInterface baseInterface){
        this.baseInterface=baseInterface;
    }

    @Override
    int getCost() {
        return baseInterface.getCost()+300;
    }
}
