public class Homework01{
    public static void main(String[] args) {
        int money = 100000;
        int count = 0;
        while (true){
            if(money > 50000){
                money *= 0.95;
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            }else{
                break;
            }
        }
        System.out.println("该人经过了" + count + "次路口。");
    }
}