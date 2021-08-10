import java.util.Scanner;

public class scandivision {

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter user rank");
    int r = sc.nextInt();

    switch(r){
        case 1:System.out.println("You passes with first division");
        break;
        case 2:System.out.println("You passes with second division");
        break;
        case 3:System.out.println("You passes with third division");

        default:System.out.println("Youdo not come to marit");

    }
    sc.close();
}
}
