
public class Homework13 {
    public static void main(String[] args){
        Circle circle = new Circle();
        PassObject object = new PassObject();
        object.printAreas(circle,5);
    }
}

class Circle{
    static double PI = 3.14;
    double radius;

    public double findArea(){
        return radius * radius * PI;
    }
}

class PassObject{
    public void printAreas(Circle c,int times){
        System.out.println("Radius\tArea");
        for(int i = 1;i <= times;i++){
            c.radius = i;
            System.out.println(i + "\t" + c.findArea());
        }
    }
}
