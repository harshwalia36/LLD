package designpattern.strategy;

import designpattern.strategy.chipset.IntelChipset;
import designpattern.strategy.graphics.AmdRadeon;

public class ChromeBook extends Computer {
    public ChromeBook() {
        super(new IntelChipset(), new AmdRadeon());
    }

    public void display() {
        System.out.println("Starting the display");
    }

    public void powerOn() {
        System.out.println("Chromebook Powering On!");
    }

    public void powerOff() {
        System.out.println("Chromebook Powering Off!");
    }
}