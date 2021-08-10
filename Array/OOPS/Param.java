package Array.OOPS;
class Param {
    int r;
    int s;

    public Param(int x, int y) { // constructor overloading
        r = x;
        s = y;
    }
    public void sum() {
        int sum = r + s;
        System.out.println("sum=" + sum);
    }
    public static void main(String[] args) {
        Param p = new Param(2, 3);
        p.sum();

    }

}
