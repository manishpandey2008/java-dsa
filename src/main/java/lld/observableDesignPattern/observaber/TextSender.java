package lld.observableDesignPattern.observaber;

import lld.observableDesignPattern.observable.ObservableInterface;

public class TextSender implements ObserverInterface{

    String phoneNumber;
    ObservableInterface observableInterface;
    public TextSender(String phoneNumber, ObservableInterface observableInterface){
        this.phoneNumber=phoneNumber;
        this.observableInterface=observableInterface;
    }

    @Override
    public void update() {
        sendTextOnPhone();
    }

    private void sendTextOnPhone(){
        System.out.printf("Message sent to %s for %d",phoneNumber,observableInterface.getData());
        System.out.println();
    }
}