package polymorphism;

/*static polymorphism*/
class StaticPolymorphism {
    public int area(int a) {
        return (a * a);
    }

    public int area(int a, int b) {
        return (a * b);
    }

    public double area(int a, int b, int c) {
        float s = (float) (a + b + c) / 2.0f;
        double normalArea = (double) s * (s - a) * (s - b) * (s - c);
        double area = Math.sqrt(normalArea);
        return (area);
    }

    public static void main(String[] args) {
        StaticPolymorphism sp = new StaticPolymorphism();
        System.out.println("area of square=" + sp.area(5));
        System.out.println("area of Rectangle=" + sp.area(5, 10));
        System.out.println("area of traingle=" + sp.area(5, 10, 8));
    }
}
