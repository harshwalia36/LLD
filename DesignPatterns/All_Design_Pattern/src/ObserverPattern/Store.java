package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
   StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

   NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com",iphoneStocksObservable);
   NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStocksObservable);
   NotificationAlertObserver observer3 = new MobileAlertObserverImpl("1234567890", iphoneStocksObservable);

   iphoneStocksObservable.add(observer1);
   iphoneStocksObservable.add(observer2);
   iphoneStocksObservable.add(observer3);

   iphoneStocksObservable.setStockCount(10);

 }

}
