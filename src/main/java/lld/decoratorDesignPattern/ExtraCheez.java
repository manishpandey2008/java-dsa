package lld.decoratorDesignPattern;

public class ExtraCheez extends BaseInterface{

    BaseInterface baseInterface;
    ExtraCheez(BaseInterface baseInterface){
        this.baseInterface=baseInterface;
    }


    @Override
    int getCost() {
        return baseInterface.getCost()+50;
    }
}
