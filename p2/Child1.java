package p2;

import p1.Parent1;

public class Child1 extends Parent1 {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.name = "Rimjhim";
        p.account = 234;
        p.balance = 5465768;
        System.out.println("Name = " + p.name);
        System.out.println("Account = " +p.account);
        System.out.println("Balance = " + p.balance);
    }

}
