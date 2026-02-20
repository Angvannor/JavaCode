package Chapter09;

public class Homework01 {
  public static void main(String[] args) {
    try {
      if(args.length != 2) {
        throw new ArrayIndexOutOfBoundsException("参数个数不正确，请输入两个整数");
      }

      int n1 = Integer.parseInt(args[0]);
      int n2 = Integer.parseInt(args[1]);

      double res = cal(n1, n2);

    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    } catch (NumberFormatException e) {
      System.out.println("输入的参数必须是整数");
    } catch (ArithmeticException e) {
      System.out.println("除数不能为零");
    } catch (Exception e) {
      System.out.println("发生了其他异常: " + e.getMessage());
    }
  }

  public static double cal(int n1, int n2) {
    return n1 / n2;
  }
}
