package Chapter06.homework5;

public class Employee {
  private String name;
  private double salary;
  private int salMonth = 12;

  public void printSalary() {
    double annualSalary = salary * salMonth;
    System.out.println(name + "的年薪是: " + annualSalary);
  }

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setSalMonth(int salMonth) {
    this.salMonth = salMonth;
  }
}
