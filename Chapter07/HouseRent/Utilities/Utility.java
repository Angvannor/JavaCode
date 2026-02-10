package Chapter07.HouseRent.Utilities;

public class Utility {
  // 该类提供了不同类型数据的输入方法
  // 该方法读取一个字符，并将其作为方法的返回值
  public static char readChar() {
    char c = ' ';
    try {
      c = (char) System.in.read();
      // 处理回车符
      while (System.in.read() != '\n') {
        // 继续读取直到遇到换行符
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return c;
  }

  // 该方法读取一个字符串，并将其作为方法的返回值
  public static String readString(int limit) {
    String str = "";
    try {
      byte[] bytes = new byte[limit];
      int readBytes = System.in.read(bytes);
      str = new String(bytes, 0, readBytes).trim();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return str;
  }

  // 该方法读取一个整数，并将其作为方法的返回值
  public static int readInt() {
    int num = 0;
    try {
      byte[] bytes = new byte[10]; // 假设输入的整数不会超过10位
      int readBytes = System.in.read(bytes);
      String str = new String(bytes, 0, readBytes).trim();
      num = Integer.parseInt(str);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return num;
  }

  public static void readReturn() {
    try {
      System.in.read();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static char confirmSelection() {
    char c = ' ';
    do {
      System.out.print("请确认你的选择(Y/N): ");
      c = readChar();
    } while (c != 'Y' && c != 'N');
    return c;
  }
}
