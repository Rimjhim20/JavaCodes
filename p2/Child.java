package p2;

import p1.Parent;

public class Child extends Parent {

    // public void show() {
    //     a = 10;
    //     c = 90;
    //     b=34;

    // }

    public static void main(String[] args) {
       Parent p=new Parent();
       p.a=10;
    //    p.c=20;
        p.b=20;
    //    p.d=20;
       System.out.println("a = " + p.a);
      System.out.println("b = " + p.b);
    }
}