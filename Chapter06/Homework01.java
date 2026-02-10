package Chapter06;

class Person {
private String name;
private int age;
private String job;

public Person(String name, int age, String job) {
  this.name = name;
  this.age = age;
  this.job = job;
}

public String getName(){
  return name;
}

public int getAge(){
  return age;
}

public String getJob(){
  return job;
}
}

public class Homework01 {
  
  Person[] persons = new Person[3];
  
  public Homework01() {
    persons[0] = new Person("张三", 25, "程序员");
    persons[1] = new Person("李四", 30, "设计师");
    persons[2] = new Person("王五", 28, "产品经理");
  }
  
  public void sortByAge(){
    for(int i = 0; i < persons.length - 1; i++){
      for(int j = 0; j < persons.length - 1 - i; j++){
        if(persons[j].getAge() < persons[j + 1].getAge()){
          Person temp = persons[j];
          persons[j] = persons[j + 1];
          persons[j + 1] = temp;
        }
      }
    }
  }
  
  public static void main(String[] args){
    Homework01 homework01 = new Homework01();
    homework01.sortByAge();
    for(Person person : homework01.persons){
      System.out.println("姓名：" + person.getName() + "\t年龄：" + person.getAge() + "\t职业：" + person.getJob());
    }
  }
}
