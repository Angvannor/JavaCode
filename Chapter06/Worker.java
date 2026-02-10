package Chapter06;

public class Worker extends Employee {
  public Worker(String name, double salaryPerDay, int workDays, double grade) {
    super(name, salaryPerDay, workDays, grade);
  }
  
  @Override
  public void printSalary() {
    super.printSalary();
  }
}
