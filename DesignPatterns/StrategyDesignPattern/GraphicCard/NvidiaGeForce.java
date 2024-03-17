package designpattern.strategy.graphics;

public class NvidiaGeForce implements GraphicsCard {
    @Override
    public void installGraphicsCard() {
        System.out.println("Installing Nvidia GE Force Graphic Card");
    }
}