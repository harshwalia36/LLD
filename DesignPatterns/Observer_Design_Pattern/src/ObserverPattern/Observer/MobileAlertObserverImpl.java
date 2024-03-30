package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
     
    String phoneNo;
    StocksObservable observable;

    public MobileAlertObserverImpl(String phoneNo, StocksObservable observable) {
        this.phoneNo = phoneNo;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendCall(phoneNo, "product is in stock hurry up!");
    }

    private void sendCall(String phoneNo, String msg){
        System.out.println("Phobe call Sent to:" + phoneNo + "with msg:" + msg);
    }
}
