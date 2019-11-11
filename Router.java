
class Router {
  String brand;
  String modelNumber;
  double price;

  Router(String brand, String modelNumber, Double price) {
    this.brand = brand;
    this.modelNumber = modelNumber;
    this.price = price;
  }

  public String getBrand() {
    return this.brand;
  }

  public String getModelNumber() {
    return this.modelNumber;
  }

  public double getPrice() {
    return this.price;
  }

  public String toString() {
    return "brand: " + getBrand() + ", model number: " + this.modelNumber + ", price: " + Double.toString(getPrice());
  }
}