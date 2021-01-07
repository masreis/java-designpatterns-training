package net.designpatterns.decorator;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

  @Test
  public void testFlowerBouquet() {
    FlowerBouquet roseBouquet = new RoseBouquet();

    System.out.println(roseBouquet.getDescription() + " $ " + roseBouquet.cost());
    FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
    decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
    decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);
    decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
    System.out.println(decoratedRoseBouquet.getDescription() + " $ " + decoratedRoseBouquet.cost());

    FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
    decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
    decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
    decoratedOrchidBouquet = new RibbonBow(decoratedOrchidBouquet);
    System.out.println(
        decoratedOrchidBouquet.getDescription() + " $ " + decoratedOrchidBouquet.cost());
  }
}
