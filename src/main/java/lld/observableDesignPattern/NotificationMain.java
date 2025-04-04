package lld.observableDesignPattern;

import lld.observableDesignPattern.observaber.EmailSender;
import lld.observableDesignPattern.observaber.PopupSender;
import lld.observableDesignPattern.observaber.TextSender;
import lld.observableDesignPattern.observable.NotificationCollector;
import lld.observableDesignPattern.observable.ObservableInterface;

public class NotificationMain {
    public static void main(String[] args) {
        ObservableInterface observableInterface=new NotificationCollector();
        observableInterface.addNotification(new EmailSender("smpande.2008@gmail.com",observableInterface));
        observableInterface.addNotification(new TextSender("7867654343",observableInterface));
        observableInterface.addNotification(new PopupSender("pandey@123",observableInterface));

        observableInterface.setData(20);
        observableInterface.setData(10);

    }
}
