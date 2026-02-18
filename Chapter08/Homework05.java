package Chapter08;

public class Homework05 {
  public static void main(String[] args) {
    new A().f1();
  }
}

class A {
  private String name = "A";

  public void f1() {
    class B {
      private final String NAME = "B";
      public void show() {
        System.out.println(NAME + "在" + A.this.name + "的f1方法中");
      }
    }

    B b = new B();
    b.show();
  }
}
