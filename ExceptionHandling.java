import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two num");

        int a=s.nextInt();
        int b=s.nextInt();

        try{
            int c=a/b;
            System.out.println("Division on num="+c);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage() +"HAS OCCURED");
        }
    }
}
