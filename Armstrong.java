import java.util.Scanner;


public class Armstrong {


        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number");
            int a=sc.nextInt();
      int  b, rem, c = 0;

        b = a;

        while (b != 0)
        {
            rem = b % 10;
           c += Math.pow(rem, 3);

            b /= 10;
        }

        if(c == a)
            System.out.println(a + " is an Armstrong number.");
        else
            System.out.println(a + " is not an Armstrong number.");
            sc.close();
    }
}