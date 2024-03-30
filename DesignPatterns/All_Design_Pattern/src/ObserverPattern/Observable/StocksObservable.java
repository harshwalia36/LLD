package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
     // Add Observer
     public void add(NotificationAlertObserver Observer);
     // remover observer
     public void remove(NotificationAlertObserver Observer);

     public void notifySubscriber();

     public void setStockCount(int newStockAdded);

     public int getStockCount();
}