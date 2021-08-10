package Array;

/*illustration array*/
import java.util.Scanner;

class Arrayexam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers in array");
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Entered values in array are");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        s.close();
    }
}
