
abstract class Shape {
    abstract public void area();

}
class Rectangle2 extends Shape {

    public void area() {
        float l = 5;
        float b = 5;
        float area = l * b;
        System.out.print("area of Rectangle=" + area);

    }
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2();
        r.area();

    }

}
