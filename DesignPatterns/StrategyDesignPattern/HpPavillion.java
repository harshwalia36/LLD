// Computer sub classes which extend the abstract Computer class.

package designpattern.strategy;

import designpattern.strategy.chipset.IntelChipset;
import designpattern.strategy.graphics.NvidiaGeForce;

public class HpPavillion extends Computer {
    public HpPavillion() {
        super(new IntelChipset(), new NvidiaGeForce());  // super keyword is used to call the constructor of Super class: computer
    }

    public void display() {
        System.out.println("Starting the display");
    }

    public void powerOn() {
        System.out.println("HP Pavillion Powering On!");
    }

    public void powerOff() {
        System.out.println("HP Pavillion Powering Off!");
    }
}