
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        float eng, evs, chem, math, comp;
        double total, percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of five subjects:");
        System.out.print("Enter marks of evs ");
        eng = sc.nextFloat();
        System.out.print("Enter marks of eng :");
        evs = sc.nextFloat();
        System.out.print("Enter marks of chem:");
        chem = sc.nextFloat();
        System.out.print("Enter marks of maths:");
        math = sc.nextFloat();
        System.out.print("Enter marks of computers:");
        comp = sc.nextFloat();

        total = eng + evs + chem + math + comp;

        percentage = (total / 500.0) * 100;

        System.out.println("Total marks =" + total);

        System.out.println("Percentage = " + percentage);
        sc.close();
    }
}
