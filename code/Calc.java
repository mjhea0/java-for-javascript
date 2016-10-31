public class Calc {

  public int num1;
  public int num2;

  public Calc(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public int add()  {
    return this.num1 + this.num2;
  }
  public int subtract()  {
    return this.num1 - this.num2;
  }
  public int multiply()  {
    return this.num1 * this.num2;
  }
  public int divide()  {
    return this.num1 / this.num2;
  }

  public static void main(String[] args) {
    Calc testCalc = new Calc(2, 2);
    System.out.println(testCalc.add());
    System.out.println(testCalc.subtract());
    System.out.println(testCalc.multiply());
    System.out.println(testCalc.divide());
  }

};
