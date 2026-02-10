public class Homework14 {
    public static void main(String[] args){
        Tom tom = new Tom("Tom");

        for (int i = 1; i <= 5; i++) {
            System.out.println("第 " + i + " 局：");

            int tomMove = tom.play();
            int computerMove = (int)(Math.random() * 3);

            tom.judge(tomMove, computerMove);
            System.out.println();
        }

        System.out.println("Tom 最终赢了 " + tom.winCount + " 次");
    }
}

class Tom{
    String name;
    int winCount;

    public Tom(String name){
        this.name = name;
    }

    public int play(){
        int r = (int)(Math.random() * 3);
        System.out.println(name + "出" + show(r));
        return r;
    }

    public void judge(int tom,int computer){
        System.out.println("电脑出:" + show(computer));

        if ((tom == 0 && computer == 1) ||
                (tom == 1 && computer == 2) ||
                (tom == 2 && computer == 0)) {

            System.out.println("Tom 赢！");
            winCount++;

        } else if (tom == computer) {
            System.out.println("平局");
        } else {
            System.out.println("电脑赢");
        }
    }

    public String show(int n) {
        if (n == 0) return "石头";
        if (n == 1) return "剪刀";
        return "布";
    }
}