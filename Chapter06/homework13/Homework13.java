package Chapter06.homework13;

public class Homework13 {
  public static void main(String[] args) {
    Student student = new Student("张三", 20, "男", "123456");
    student.printInfo();

    Teacher teacher = new Teacher("李四", 35, "女", 10);
    teacher.printInfo();

    Person[] persons = new Person[4];
    persons[0] = student;
    persons[1] = teacher;
    persons[2] = new Student("王五", 22, "男", "654321");
    persons[3] = new Teacher("赵六", 40, "男", 15);

    System.out.println("\n按年龄排序后:");
    sortByAge(persons);
    for (Person person : persons) {
      person.printInfo();
      System.out.println();
    }
  }

  public void test(Person person) {
    if(person instanceof Student) {
      Student student = (Student) person;
      student.study();
    } else if (person instanceof Teacher) {
      Teacher teacher = (Teacher) person;
      teacher.teach();
    } else {
      System.out.println("未知类型");
    }
  }

  public static void sortByAge(Person[] persons) {
    for (int i = 0; i < persons.length - 1; i++) {
      for (int j = 0; j < persons.length - 1 - i; j++) {
        if (persons[j].getAge() > persons[j + 1].getAge()) {
          Person temp = persons[j];
          persons[j] = persons[j + 1];
          persons[j + 1] = temp;
        }
      }
    }
  }
}
