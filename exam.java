// import java.util.Scanner;

class Example{
    public Example(){
    System.out.print("Hello constructor");
    }
    public Example(int x,int y){
    int z=x+y;
    System.out.println("sum="+z);
    this();
    }
    public static void main(String[] args){
    Example ex=new Example(5,5);
    }
    }