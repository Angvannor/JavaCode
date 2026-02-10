package Chapter06.homework5;

public class Teacher extends Employee {
  private int classDays;
  private double classSalary;

  public Teacher(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void printSalary() {
    System.out.print("教师 ");
    System.out.println(getName() + "的年薪是: " + (getSalary() * 12 + classDays * classSalary));
  } 

  public int getClassDays() {
    return classDays;
  }

  public void setClassDays(int classDays) {
    this.classDays = classDays;
  }

  public double getClassSalary() {
    return classSalary;
  }

  public void setClassSalary(double classSalary) {
    this.classSalary = classSalary;
  }
}
