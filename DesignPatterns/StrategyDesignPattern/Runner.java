package designpattern.strategy;

import designpattern.strategy.HpPavillion;
import designpattern.strategy.Macbook;
import designpattern.strategy.ChromeBook;



public class Runner {
    public static void main(String[] args) {
        HpPavillion hpPavillion = new HpPavillion();
        hpPavillion.powerOn();
        hpPavillion.display();
        hpPavillion.powerOff();

        AppleMacbook macBook = new AppleMacbook();
        macBook.powerOn();
        macBook.display();
        macBook.powerOff();

        ChromeBook chromeBook = new ChromeBook();
        chromeBook.powerOn();
        chromeBook.display();
        chromeBook.powerOff();

        System.out.println();
    }
}

/*
 *  Sauarav prateek design pattern: https://www.linkedin.com/pulse/strategy-pattern-flexible-architecture-saurav-prateek-xmbwc/
 */