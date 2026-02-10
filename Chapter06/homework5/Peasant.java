package Chapter06.homework5;

public class Peasant extends Employee {
  public Peasant(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void printSalary() {
    System.out.print("农民 ");
    super.printSalary();
  }
}
