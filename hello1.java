import java.util.Scanner;

public class hello1 {
   

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int opt;
    do{
    System.out.println("Hello World");
    System.out.println("Do you want to print it again");
    opt = sc.nextInt();
    }while(opt==1);

    sc.close();
}
}

