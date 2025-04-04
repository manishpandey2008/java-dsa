package lld.observableDesignPattern.observaber;

import lld.observableDesignPattern.observable.ObservableInterface;

public class EmailSender implements ObserverInterface{
    String emailId;
    ObservableInterface observableInterface;
    public EmailSender(String emailId, ObservableInterface observableInterface){
        this.emailId=emailId;
        this.observableInterface=observableInterface;
    }

    @Override
    public void update() {
        sendMail();
    }

    private void sendMail(){
        System.out.printf("Email send to %s for %d",emailId,observableInterface.getData());
    }
}
