import java.util.Scanner;

public class evenodd {

    public static void main(String args[]) {
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        a = sc.nextInt();

        if(a%2==0){
            System.out.print("Even number");
        }
        else{
            System.out.print("odd number");
        }
        sc.close();
    }
}
