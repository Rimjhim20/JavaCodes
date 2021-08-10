
import java.util.Scanner;
class cal{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers");
int a=s.nextInt();
int b=s.nextInt();



System.out.println("Please enter a number corresponding to your operation");
System.out.println("1 : Addition");
System.out.println("2 : Substraction");
System.out.println("3 : Multiplication");
System.out.println("4 : Division");
int n=s.nextInt();
int c=0;
switch(n){
case 1:
c=a+b;
System.out.println("Sum of two number="+c);
break;
case 2:
c=a-b;
System.out.println("Substraction of two number="+c);
break;
case 3:
c=a*b;
System.out.println("Multiplication of two number="+c);
break;
case 4:
float result=(float)a/b;
System.out.println("division of two number="+ result);
break;
default:
System.out.println("Sum of two number=");
}

s.close();
}



}