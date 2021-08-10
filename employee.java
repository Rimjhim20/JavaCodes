import java.util.Scanner;
public class employee{
   public static void main (String args[])
   {
      Scanner sc = new Scanner(System.in);
      double DA,HRA,TA,netsalary,bp;
      System.out.println("Enter basic pay:");
      bp=sc.nextDouble();
      DA=(2.0/100.0)*bp;
      HRA=(12.0/100.0)*bp;
      TA=(10.0/100.0)*bp;
      netsalary=bp+DA+TA+HRA;
      System.out.println("DA:" +DA);
      System.out.println("HRA:" +HRA);
      System.out.println("TA:" +TA);
      System.out.println("Net Pay:" +netsalary);

      sc.close();
   }
}