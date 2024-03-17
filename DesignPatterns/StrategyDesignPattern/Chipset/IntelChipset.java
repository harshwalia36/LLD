// Another concrete chipset class, IntelChipset.

package designpattern.strategy.chipset;

public class IntelChipset implements Chipset {
    @Override
    public void installChipset() {
        System.out.println("Installing Intell Chipset");
    }
}