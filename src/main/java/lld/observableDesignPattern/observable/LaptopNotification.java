package lld.observableDesignPattern.observable;

import lld.observableDesignPattern.observaber.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class LaptopNotification implements ObservableInterface{

    List<ObserverInterface> list=new ArrayList<>();
    int currentDate=0;

    @Override
    public void addNotification(ObserverInterface observableInterface) {
        list.add(observableInterface);
    }

    @Override
    public void removeNotifications(ObserverInterface observableInterface) {
        list.remove(observableInterface);
    }

    @Override
    public void createNotification() {
        list.forEach(o->{
            o.update();
            System.out.println();
        });
    }

    @Override
    public void setData(int count) {
        System.out.printf("Total Notification =%d",list.size());
        if(count!=currentDate){
            createNotification();
        }
        this.currentDate=count;
    }

    @Override
    public int getData() {
        return this.currentDate;
    }
}
