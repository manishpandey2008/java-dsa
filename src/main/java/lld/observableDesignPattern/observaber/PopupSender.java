package lld.observableDesignPattern.observaber;

import lld.observableDesignPattern.observable.ObservableInterface;

public class PopupSender implements ObserverInterface{

    String userName;
    ObservableInterface observableInterface;
    public PopupSender(String userName, ObservableInterface observableInterface){
        this.userName=userName;
        this.observableInterface=observableInterface;
    }

    @Override
    public void update() {
        this.sendPopup();
    }

    private void sendPopup(){
        System.out.printf("Popup message send to %s for %d",userName,observableInterface.getData());
    }
}