package Chapter06;

public class Employee {
  private String name;
  private double salaryPerDay;
  private int workDays;
  private double grade;

  public void printSalary() {
    double salary = salaryPerDay * workDays * grade;
    System.out.println(name + "的工资是: " + salary);
  }

  public Employee(String name, double salaryPerDay, int workDays, double grade) {
    this.name = name;
    this.salaryPerDay = salaryPerDay;
    this.workDays = workDays;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public double getSalaryPerDay() {
    return salaryPerDay;
  }

  public int getWorkDays() {
    return workDays;
  }

  public double getGrade() {
    return grade;
  }
}