import java.util.Scanner;

public class Nestedfor {
    public static void main(String args[])   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting and ending num: ");
       int n = sc.nextInt();
       int m = sc.nextInt();
       if(m>=n){
           int i;
           for(; n<=m;n++){

            for(i=1;i<=10;i++){
                System.out.println(n+ " * "+i+" = " +n*i);
            }
            System.out.println();
           }
       }
       else{
        System.out.println("Uper value should not less than lower");
       }
       sc.close();
    }
}
