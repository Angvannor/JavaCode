public class Homework06 {
    public static void main(String[] args){
        Cale cale01 = new Cale();
        Cale cale02 = new Cale();

        cale01.num1 = 2;
        cale01.num2 = 5;

        cale02.num1 = 3;
        cale02.num2 = 10;

        double add1 = cale01.add();
        double minus1 = cale01.minus();

        double mult2 = cale02.mult();
        double divi2 = cale02.divi();

        System.out.println("add1 = " + add1);
        System.out.println("minus1 = " + minus1);
        System.out.println("mult2 = " + mult2);
        System.out.println("divi2 = " + divi2);
    }
}

class Cale{
    double num1 = 0;
    double num2 = 0;

    public double add(){
        return num1 + num2;
    }

    public double minus(){
        return num1 - num2;
    }

    public double mult(){
        return num1 * num2;
    }

    public double divi(){
        return num1 / num2;
    }
}