package Chapter08;

public class Person {
  private String name;
  private Vehicles vehicle;

  public Person(String name, Vehicles vehicle) {
    this.name = name;
    this.vehicle = vehicle;
  }

  public void passRiver() {
    if(!(vehicle instanceof Boat)) {
      vehicle = VehicleFactory.getBoat();
    }
    vehicle.work();
  }

  public void common() {
    if(!(vehicle instanceof Horse)) {
      vehicle = VehicleFactory.getHorse();
    }
    vehicle.work();
  }
}
