package Array.OOPS;

/*Copy constructor*/
class CopyConst {
    int a, b;

    public CopyConst(int x, int y) {
        a = x;
        b = y;
    }

    public CopyConst(CopyConst copy) { // copy constructor - constructor overloading
        a = copy.a;
        b = copy.b;
    }

    public void print() {
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void main(String[] args) {

        CopyConst copy1 = new CopyConst(2, 4);
        CopyConst copy2 = new CopyConst(copy1);
        copy1.print();
        copy2.print();
    }

}