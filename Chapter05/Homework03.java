public class Homework03 {
    public static void main(String[] args){
        Book book = new Book();
        book.updatePrice(169);
    }
}

class Book{
    public int updatePrice(int money){
        if(money > 150){
            money = 150;
            System.out.println("该书的价格调整为" + money);
        }else if(money > 100){
            money = 100;
            System.out.println("该书的价格调整为" + money);
        }else{
            System.out.println("该书的价格无需调整");
        }
        return money;
    }
}