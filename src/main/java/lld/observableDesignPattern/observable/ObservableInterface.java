package lld.observableDesignPattern.observable;

import lld.observableDesignPattern.observaber.ObserverInterface;

public interface ObservableInterface {
    void addNotification(ObserverInterface observerInterface);
    void removeNotifications(ObserverInterface observerInterface);
    void createNotification();
    void setData(int data);
    int getData();
}
