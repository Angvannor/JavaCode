package Chapter06.homework13;

public class Student extends Person {
  private String stu_id;

  public Student(String name, int age, String gender, String stu_id) {
    super(name, age, gender);
    this.stu_id = stu_id;
  }

  public String getStu_id() {
    return stu_id;
  }

  public void setStu_id(String stu_id) {
    this.stu_id = stu_id;
  }

  public void study() {
    System.out.println("学生 " + getName() + " 正在学习");
  }
  
  @Override
  public String play() {
    return "学生 " + getName() + " 正在玩" + "足球";
  }

  public void printInfo() {
    super.printInfo();
    System.out.println("学号: " + stu_id);
    this.study();
    System.out.println(this.play());
  } 
}

