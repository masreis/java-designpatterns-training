package net.designpatterns.decorator;

public class PaperWrapper extends FlowerBouquetDecorator {
  private FlowerBouquet flowerBouquet;

  public PaperWrapper(FlowerBouquet flowerBouquet) {
    this.flowerBouquet = flowerBouquet;
  }

  public String getDescription() {
    return flowerBouquet.getDescription() + ", paper wrap";
  }

  public double cost() {
    return 3 + flowerBouquet.cost();
  }
}
