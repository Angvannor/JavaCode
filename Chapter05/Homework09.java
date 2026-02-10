public class Homework09 {
    public static void main(String[] args){
        Music music = new Music();
        music.name = "Numb";
        music.times = 170;
        music.play();
        music.getInfo();
    }
}

class Music{
    String name;
    int times;

    public void play(){
        System.out.println("正在播放" + name);
    }

    public void getInfo(){
        System.out.println("歌名：" + name);
        System.out.println("听歌时长：" + times + "次");
    }
}