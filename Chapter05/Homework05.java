public class Homework05 {
    public static void main(String[] args){
        Circle circle = new Circle();
        double round = circle.round();
        double square = circle.square();
        System.out.println("圆的周长为" + round + "  面积为" + square);
    }
}

class Circle{
    int r = 5;
    static double PI = 3.14;

    public double round(){
        return 2 * PI * r;
    }

    public double square(){
        return PI * r * r;
    }
}