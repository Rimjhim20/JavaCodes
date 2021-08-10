package Inheritance;
/*illustrate inheritance*/
class Parent {
    public int a;
}
class Child extends Parent {
    int b;
    public void init(int x, int y) {
        a = x;
        this.b = y;
    }
    public void sum() {
        int c = a + b;
        System.out.println("sum of two number=" + c);
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.init(5, 10);
        c.sum();
    }
}
