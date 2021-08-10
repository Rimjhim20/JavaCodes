package constructor;

public class defaultcons {
  int a;
  boolean b;
  float c;

  public static void main(String[] args) {

    // A default constructor is called
    defaultcons obj = new defaultcons();

    System.out.println("Default Value:");
    System.out.println("a = " + obj.a);
    System.out.println("b = " + obj.b);
    System.out.println("b = " + obj.c);
  }
}