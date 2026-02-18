package Chapter08;

public class Homework08 {
  public static void main(String[] args) {
    Color color = Color.GREEN;
    color.show();

    switch(color) {
      case RED:
        System.out.println("这是红色");
        break;
      case GREEN:
        System.out.println("这是绿色");
        break;
      case BLUE:
        System.out.println("这是蓝色");
        break;
      case BLACK:
        System.out.println("这是黑色");
        break;
      case YELLOW:
        System.out.println("这是黄色");
        break;
    }
  }
}

interface IMyInterface {
  public void show();
}

enum Color implements IMyInterface {
  RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0);

  private int redValue;
  private int greenValue;
  private int blueValue;

  Color(int redValue, int greenValue, int blueValue) {
    this.redValue = redValue;
    this.greenValue = greenValue;
    this.blueValue = blueValue;
  }

  @Override
  public void show() {
    System.out.println("这是颜色:" + this.name() + ", RGB值为(" + redValue + "," + greenValue + "," + blueValue + ")");
  }

  public int getRedValue() {
    return redValue;
  }

  public int getGreenValue() {
    return greenValue;
  }

  public int getBlueValue() {
    return blueValue;
  }
}
