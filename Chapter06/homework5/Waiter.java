package Chapter06.homework5;

public class Waiter extends Employee {
  public Waiter(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void printSalary() {
    System.out.print("服务员 ");
    super.printSalary();
  }
}
