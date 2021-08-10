package string;
//import java.lang.*;
import java.util.Scanner;
public class stringbuffer {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string");
          String firstString = s.next();
        StringBuffer sb=new StringBuffer(firstString);
        sb.reverse();
        String secondString = sb.toString();
        if(firstString.equals(secondString)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not Palindrome string");
        }

    


        s.close();
    }
}
