import java.util.Scanner;

public class Dowhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");

        int n = sc.nextInt();
        int factorial = 1;
        int i = 1;

        do {
            factorial = factorial * i;
            i++;
        } while (i <= n);

        System.out.println("Factorial of " + n + " is: " + factorial);
        sc.close();
    }
}
