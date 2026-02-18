package Chapter08;

public class Homework07 {
  public static void main(String[] args) {
    Car2 car2 = new Car2(60);
    car2.getAir().flow();
  }
}

class Car2 {
  private double temperature;

  public Car2(double temperature) {
    this.temperature = temperature;
  }

  class Air {
    public void flow() {
      if(temperature > 40) {
        System.out.println("吹冷风");
      } else if(temperature < 0) {
        System.out.println("吹暖风");
      } else {
        System.out.println("吹自然风");
      }
    }
  }
  public Air getAir() {
    return new Air();
  }
}
