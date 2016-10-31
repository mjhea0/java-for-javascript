public class Rect {

  public int width;
  public int length;

  public Rect(int width, int length) {
    this.width = width;
    this.length = length;
  }

  public int area() {
    return this.width * this.length;
  }

  public static void main(String[] args) {
    Rect myReact = new Rect(100, 100);
    System.out.println(myReact.area());
  }

}
