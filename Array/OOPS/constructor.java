package Array.OOPS;

public class constructor {
}
//Constructor is just like a method having same name of the class which is use to initialise data members of the object.
//Type of Constructor 1.Default constructor

/*class object example*/
class FirstClass{
int a,b;
public FirstClass(){
a=0;
b=0;
}
public void sum(){
System.out.println(a+b);
}
public static void main(String[] args){
FirstClass fc=new FirstClass();//constructor
fc.sum();
}
}
//Parameterised constructor
