public class Starpattern {
    public static void main(String[] args){
        int i, j, row=5;   
        for(i=0; i<row; i++)   // //outer loop for rows  
        {   
        for(j=0; j<=i; j++)   //inner loop for columns  
        {   
        System.out.print("*");   
        }   
        System.out.println();   
        }   

    }}