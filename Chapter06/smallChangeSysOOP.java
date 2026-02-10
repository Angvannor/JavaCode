package Chapter06;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class smallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    String details = "----------零钱通明细----------\t"; //明细
    double balance = 0; //余额
    double money = 0; //每次收入/支出金额
    Date date = null; //日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //日期格式化

  
  public void mainMenu(){
      do{
        System.out.println("\n==========零钱通菜单==========");
        System.out.println("\t\t1.零钱通明细");
        System.out.println("\t\t2.收入");
        System.out.println("\t\t3.支出");
        System.out.println("\t\t4.退出");
  
        key = scanner.next();
  
        switch(key){
          case "1":
            this.showDetails();
            break;
          case "2":
            this.income();
            break;
          case "3":
            this.expense();
            break;
          case "4":
            this.exit();
            break;
        }
      }while(loop);
    }

    private void showDetails(){
      System.out.println(details);
    }

    private void income(){
      System.out.println("请输入收入金额：");
            money = scanner.nextDouble();
            if(money <= 0){
              System.out.println("收入金额必须大于0");
              return;
            }
            balance += money;
            date = new Date();
            details += "\n收入\t" + sdf.format(date) + "\t收入金额：" + money + "\t余额：" + balance;
    }

    private void expense(){
      System.out.println("请输入支出金额：");
            money = scanner.nextDouble();
            if(money <= 0){
              System.out.println("支出金额必须大于0");
              return;
            }
            if(money > balance){
              System.out.println("余额不足，无法支出");
              return;
            }
            balance -= money;
            date = new Date();
            details += "\n支出\t" + sdf.format(date) + "\t支出金额：" + money + "\t余额：" + balance;
    }

    private void exit(){
      String confirm = "";
            while(true){
              System.out.println("你确定要退出吗？(y/n)");
              confirm = scanner.next();
              if(confirm.equalsIgnoreCase("y")){
                loop = false;
                return;
              }else if(confirm.equalsIgnoreCase("n")){
                return;
              }else{
                System.out.println("输入无效，请输入y或n");
              }
            }
    }
}
