// Concret Graphic Card class AmdRadeon

package designpattern.strategy.graphics;

public class AmdRadeon implements GraphicsCard{
    @Override
    public void installGraphicsCard() {
        System.out.println("Installing AMD Radeon Graphic card");
    }
}