package designpattern.strategy;


import designpattern.strategy.chipset.AppleM1Chipset;
import designpattern.strategy.graphics.NvidiaGeForce;

public class AppleMacbook extends Computer {
    public AppleMacbook() {
        super(new AppleM1Chipset(), new NvidiaGeForce());
    }

    public void display() {
        System.out.println("Starting the display");
    }

    public void powerOn() {
        System.out.println("Apple Macbook Powering On!");
    }

    public void powerOff() {
        System.out.println("Apple Macbook Powering Off!");
    }
}