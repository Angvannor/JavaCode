public class Homework06 {
    public static void main(String[] args){
        int count = 0;
        for(int i = 0;i <= 100;i++){
                if(i % 5 != 0){
                System.out.print(i + "\t");
                count++;
                if(count == 5){
                    count = 0;
                    System.out.println("");
                }
            }
        }
    }
}