package Chapter08;

public class VehicleFactory {
  private static Horse horse = new Horse();
  private static Boat boat = new Boat();

  public static Horse getHorse() {
    return new Horse();
  }

  public static Boat getBoat() {
    return new Boat();
  }
}
