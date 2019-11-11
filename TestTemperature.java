public class TestTemperature {
  public static void main(String[] args) {
    Temperature temperature = new Temperature();
    System.out.println(temperature.toString());

    temperature.decreasePercent(2, 10);
    System.out.println("New value: " + temperature.getValue(2));

    System.out.println("Min: " + temperature.maximumIndex() + ", Trimmed Mean: " + temperature.trimmedMean());
  }
}