import java.util.Scanner;
public class scanner {
     public static void main(String[] args){

        System.out.println("Enter two numbers -");

        Scanner sc=new Scanner(System.in);

        float base =sc.nextFloat();

        float height = sc.nextFloat();

        float area = (base * height)/2;

        System.out.println(" area: - "+area);
        sc.close();
    }  

  }

