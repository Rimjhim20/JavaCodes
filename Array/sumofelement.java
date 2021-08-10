package Array;

public class sumofelement {
    


    public static void main(String[] args) {  
        int [] arr = new int [] {1, 4, 6, 9, 11};  
        int sum = 0;  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
}