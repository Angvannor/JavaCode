package Chapter06;

public class Manager extends Employee {
  private double bonus;

  public Manager(String name, double salaryPerDay, int workDays, double grade) {
    super(name, salaryPerDay, workDays, grade);
  }

  @Override
  public void printSalary() {
    System.out.println("经理" + getName() + "的工资是: " + 
    (getSalaryPerDay() * getWorkDays() * getGrade() + bonus));
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }
}
