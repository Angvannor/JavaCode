package Chapter06;

public class Homework03 {
  public static void main(String[] args) {
    Professor professor = new Professor("张三", 50, "教授", 10000);
    AssociateProfessor associateProfessor = new AssociateProfessor("李四", 40, "副教授", 8000);
    Lecturer lecturer = new Lecturer("王五", 30, "讲师", 6000);

    professor.introduce();
    associateProfessor.introduce();
    lecturer.introduce();
  }
}

class Teacher {
  private String name;
  private int age;
  private String post;
  private double salary;

  public Teacher(String name, int age, String post, double salary) {
    this.name = name;
    this.age = age;
    this.post = post;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getPost() {
    return post;
  }

  public double getSalary() {
    return salary;
  }

  public void introduce() {
    System.out.println("姓名：" + name + "\t年龄：" + age + "\t职称：" + post + "\t工资：" + salary);
  }
}

class Professor extends Teacher {
  public Professor(String name, int age, String post, double salary) {
    super(name, age, post, salary * 1.3); //教授工资比基本工资高30%
  }

  public void introduce() {
    System.out.println("教授：");
    super.introduce();
  }
}

class AssociateProfessor extends Teacher {
  public AssociateProfessor(String name, int age, String post, double salary) {
    super(name, age, post, salary * 1.2); //副教授工资比基本工资高20%
  }

  public void introduce() {
    System.out.println("副教授：");
    super.introduce();
  }
}

class Lecturer extends Teacher {
  public Lecturer(String name, int age, String post, double salary) {
    super(name, age, post, salary * 1.1); //讲师工资比基本工资高10%
  }

  public void introduce() {
    System.out.println("讲师：");
    super.introduce();
  }
}
