package Inheritance;

/*illustraiting use of super keyword*/
class Parent3 {
    public int a;
    public Parent3(int a) {
        this.a = a;
    }

    public void showA() {
        System.out.println("Value of a=" + a);
    }
}

class UsingSuper extends Parent3 {
    public UsingSuper(int x) {
        super(x); // calling parent class constructor
        System.out.println("value initialized by constructor=" + super.a);// calling parent class property
        super.showA();// calling parent class method
    }

    public static void main(String[] args) {
        new UsingSuper(5);
    }
}
