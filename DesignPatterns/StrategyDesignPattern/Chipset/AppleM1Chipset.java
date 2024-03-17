// We have concrete Chipset classes which implement the above Chipset interface.
// Let’s look around one of the concrete chipset class AppleM1Chipset.


package designpattern.strategy.chipset;

public class AppleM1Chipset implements Chipset {
    @Override
    public void installChipset() {
        System.out.println("Installing Apple M1 Chipset");
    }
}