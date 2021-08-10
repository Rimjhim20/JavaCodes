package constructor;
public class CopyConst {
    float a, b;
    float area;

    public CopyConst() {
        
    }
    public CopyConst(int a, int b) {
        this();
        this.a = a;
        this.b = b;
        this.print();
    }
    public CopyConst(CopyConst copy1){
    a=copy1.a;
    b=copy1.b;
    print();
}
    public void print() {
        System.out.println("area of triangle ="+(a*b)/2);
    }
    public static void main(String[] args){
        CopyConst copy1 = new CopyConst(2,4);
        
    }
}