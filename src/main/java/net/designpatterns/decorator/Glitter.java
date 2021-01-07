package net.designpatterns.decorator;

public class Glitter extends FlowerBouquetDecorator {
  private FlowerBouquet flowerBouquet;

  public Glitter(FlowerBouquet flowerBouquet) {
    this.flowerBouquet = flowerBouquet;
  }

  public String getDescription() {
    return flowerBouquet.getDescription() + ", glitter";
  }

  public double cost() {
    return 4 + flowerBouquet.cost();
  }
}
