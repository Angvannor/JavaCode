import java.util.Scanner;
public class Homework03{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = myScanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("该年为闰年");
        }else{
            System.out.println("该年不是闰年");
        }
    }
}