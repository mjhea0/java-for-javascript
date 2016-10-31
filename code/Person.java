public class Person {

  public String name;

  public Person(String name) {
    this.name = name;
  }

  public String name() {
    return this.name;
  }

  public static void main(String[] args) {
    Person teacher = new Person("Michael");
    System.out.println(teacher.name());
  }

}
