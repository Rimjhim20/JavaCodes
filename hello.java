import java.util.Scanner;

public class hello {
    public static void main(String args[]) {
        
    
            Scanner sc = new Scanner(System.in);
           int n =1;
           while(n==1){
               System.out.println("Hello World");
               System.out.println("Press 1 to print again or 2 to exit");
               int r= sc.nextInt();
               if(r==1){
                   continue;
               } else{
                   break;
               }
           }
           
        sc.close();
    }



   
    
}
