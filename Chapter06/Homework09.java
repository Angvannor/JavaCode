package Chapter06;

public class Homework09 {
  public static void main(String[] args) {
    LabeledPoint lp = new LabeledPoint("A", 3.0, 4.0);
    System.out.println("标签: " + lp.getLabel()); 
    System.out.println("坐标: (" + lp.getX() + ", " + lp.getY() + ")");
  }
  
}
