package Chapter06.homework5;

public class Homework05 {
  public static void main(String[] args) {
    Worker worker = new Worker("李四", 5000);
    worker.printSalary();

    Peasant peasant = new Peasant("王五", 3000);
    peasant.printSalary();

    Waiter waiter = new Waiter("赵六", 4000);
    waiter.printSalary();

    Teacher teacher = new Teacher("钱七", 6000);
    teacher.setClassDays(300);
    teacher.setClassSalary(50);
    teacher.printSalary();

    Scientist scientist = new Scientist("孙八", 7000);
    scientist.setBonus(20000);
    scientist.printSalary();
  }
}
