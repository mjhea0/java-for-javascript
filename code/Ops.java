public class Ops {
  public static int sum(int x, int y) {
    return x + y;
  }
  public static int multiply(int num1, int num2, int num3) {
    return num1 * num2 * num3;
  }
  public static int power(int x) {
    int y = 2;
    for (int i=0; i < y; i++) {
      x = x * x;
    }
    return x;
  }
  public static void main(String[] args) {
    System.out.println(sum(1, 2));
    System.out.println(multiply(2, 2, 2));
    System.out.println(power(2));
  }
}
