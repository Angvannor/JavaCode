package Chapter06.homework13;

public class Teacher extends Person {
  private int work_age;
  
  public Teacher(String name, int age, String gender, int work_age) {
    super(name, age, gender);
    this.work_age = work_age;
  }

  public int getWork_age() {
    return work_age;
  }

  public void setWork_age(int work_age) {
    this.work_age = work_age;
  }

  public void teach() {
    System.out.println("教师 " + getName() + " 正在授课");
  }

  @Override
  public String play() {
    return "教师 " + getName() + " 正在玩" + "象棋";
  }

  public void printInfo() {
    super.printInfo();
    System.out.println("工龄: " + work_age);
    this.teach();
    System.out.println(this.play());
  }
}
