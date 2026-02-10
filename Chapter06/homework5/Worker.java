package Chapter06.homework5;

public class Worker extends Employee {
  public Worker(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void printSalary() {
    System.out.print("工人 ");
    super.printSalary();
  }
}
