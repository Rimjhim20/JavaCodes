import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("please enter a number corresponding to your operation");
        System.out.println("1: Addition");
        System.out.println("2: Substraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        int n = sc.nextInt();
        float c = 0;
        switch (n) {
            case 1:
                c = a + b;
                System.out.println("Sum of two number:" + c);
                break;
            case 2:
                c = a - b;
                System.out.println("Substraction of two number:" + c);
                break;
            case 3:
                c = a * b;
                System.out.println("Multiplication of two number:" + c);
                break;
            case 4:
                float result =(float) a / b ;
                System.out.println("Sumof two number:" + result);
                break;

            default:
                System.out.println("Sum of two number=");
        }
        sc.close();
    }
}
