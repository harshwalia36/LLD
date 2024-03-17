// In Java, an abstract class is a class that cannot be instantiated on its own and is meant to be subclassed. 
// It serves as a blueprint for other classes and can contain both abstract methods (methods without a body) 
// and concrete methods (methods with implementation).


package designpattern.strategy;

import designpattern.strategy.chipset.Chipset;
import designpattern.strategy.graphics.GraphicsCard;

public abstract class Computer {
  private Chipset chipset;
  private GraphicsCard graphicsCard;

    public Computer(Chipset chipset, GraphicsCard graphicsCard) {
      this.chipset = chipset;
      this.graphicsCard = graphicsCard;
      configure();
    }

    private void configure() {
      System.out.println();
      System.out.println("Configuring the computer...");
      this.chipset.installChipset();
      this.graphicsCard.installGraphicsCard();
      System.out.println("Success!");
      System.out.println();
  }

  public abstract void display();

  public abstract void powerOn();

  public abstract void powerOff();
}
