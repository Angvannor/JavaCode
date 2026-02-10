package Chapter06;

public class Homework10 {
  public static void main(String[] args) {
    Doctor doctor1 = new Doctor("张医生", 20, "外科医生", "男", 1.5);
    Doctor doctor2 = new Doctor("张医生", 20, "外科医生", "男", 1.5);

    System.out.print("doctor1 和 doctor2 是否相等: " + doctor1.equals(doctor2));
  }
}
