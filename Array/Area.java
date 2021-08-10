package Array;
import java.util.Scanner;
public class Area {
    int l,w;
public void area(int x,int y){
l=x;
w=y;
int area=l*w;
System.out.println("Area of rectangle="+area);
}
public static void main(String[] args){
   
Area calc=new Area();
Scanner s = new Scanner(System.in);
System.out.println("Enter length");
calc.l= s.nextInt();// or int a = s.nextInt();
System.out.println("Enter width");//calc.b= s.nextInt();
int b = s.nextInt();//
calc.area(calc.l,b );

s.close();
}
}














