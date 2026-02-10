package Chapter06.homework5;

public class Scientist extends Employee {
  private double bonus;

  public Scientist(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void printSalary() {
    System.out.print("科学家 ");
    System.out.println(getName() + "的年薪是: " + (getSalary() * 12 + bonus));
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }
}
