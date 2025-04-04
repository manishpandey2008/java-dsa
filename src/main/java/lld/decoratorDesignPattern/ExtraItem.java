package lld.decoratorDesignPattern;

public class ExtraItem extends BaseInterface{

    BaseInterface baseInterface;

    public  ExtraItem(BaseInterface baseInterface){
        this.baseInterface=baseInterface;
    }

    @Override
    int getCost() {
        return this.baseInterface.getCost()+100;
    }
}
