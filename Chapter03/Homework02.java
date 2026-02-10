import java.util.Scanner;
public class Homework02{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = myScanner.nextInt();
        if(number > 0){
            System.out.println("该整数大于0。");
        } else if (number == 0) {
            System.out.println("该整数等于0。");
        }else{
            System.out.println("该整数小于0。");
        }
    }
}