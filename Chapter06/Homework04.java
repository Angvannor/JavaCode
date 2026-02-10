package Chapter06;

public class Homework04 {
  public static void main(String[] args) {
    Manager manager = new Manager("张三", 100, 22, 1.5);
    manager.setBonus(5000);
    manager.printSalary();

    Worker worker = new Worker("李四", 80, 22, 1.2);
    worker.printSalary();
  }
}
