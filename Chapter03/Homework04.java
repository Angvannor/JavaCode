import java.util.Scanner;
public class Homework04{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = myScanner.nextInt();
        int hundred = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        if(number == hundred * hundred * hundred + tens * tens * tens + ones * ones *ones){
            System.out.println("该数是水仙花数");
        }else{
            System.out.println("该数不是水仙花数");
        }
    }
}