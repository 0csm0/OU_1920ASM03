
public class Temperature {
  private double value[] = { 36.5, 40, 37, 38.3 };

  public String toString() {
    String text = "";
    for (int i = 0; i < value.length; i++) {
      text += i == value.length - 1 ? value[i] : value[i] + "\n";
    }
    return text;
  }

  public void decreasePercent(int index, double percent) {
    value[index] = value[index] * (1 - (percent / 100));
  }

  public double getValue(int index) {
    return value[index];
  }

  public int countNotLessThan(double threshold) {
    int count = 0;
    for (int i = 0; i < value.length; i++) {
      if (!(value[i] < threshold)) {
        count++;
      }
    }
    return count;
  }

  public int minimumIndex() {
    int minimumIndex = -1;
    double minimum = Double.MAX_VALUE;
    for (int i = 0; i < value.length; i++) {
      if (minimum > value[i]) {
        minimumIndex = i;
        minimum = value[i];
      }
    }
    return minimumIndex;
  }

  public int maximumIndex() {
    int maximumIndex = -1;
    double maximum = Double.MIN_VALUE;
    for (int i = 0; i < value.length; i++) {
      if (maximum < value[i]) {
        maximumIndex = i;
        maximum = value[i];
      }
    }
    return maximumIndex;
  }

  public double trimmedMean() {
    double total = 0;
    for (int i = 0; i < value.length; i++) {
      if (!(i == minimumIndex() || i == maximumIndex())) {
        total += value[i];
      }
    }
    return total / (value.length - 2);

  }
}