public class Homework07 {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.name = "胡真诚";
        dog1.color = "黑";
        dog1.age = 91;
        dog1.show();
    }
}

class Dog{
    String name;
    String color;
    int age;

    public void show(){
        System.out.println("这条" + this.color + "色小狗的名字是" + this.name + "，今年" + this.age + "岁");
    }
}