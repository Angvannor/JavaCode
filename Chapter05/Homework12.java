public class Homework12 {
    public static void main(String[] args){
        Employee employee1 = new Employee("Xqc","male",29);
        Employee employee2 = new Employee("Streamer",1000000.00);
        Employee employee3 = new Employee("Xqc","male",29,"Streamer",1000000.00);
    }
}

class Employee{
    String name;
    String gender;
    int age;
    String work;
    double salary;

    public Employee(String name,String gender,int age,String work,double salary){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.work = work;
        this.salary = salary;

        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("年龄：" + age);
        System.out.println("职位：" + work);
        System.out.println("薪水：" + salary);
        System.out.println("------------");
    }

    public Employee(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;

        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("年龄：" + age);
        System.out.println("------------");
    }

    public Employee(String work,double salary){
        this.work = work;
        this.salary = salary;

        System.out.println("职位：" + work);
        System.out.println("薪水：" + salary);
        System.out.println("------------");
    }
}
