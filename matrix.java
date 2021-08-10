import java.util.Scanner;

public class matrix {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Get the dimensions and array elements from the user
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
       
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       
        // Display the array in Matrix form
        System.out.println();
        System.out.println("INPUT MATRIX");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Compute row-wise and sum of all elements
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            int rSum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
                rSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rSum);
        }

        // Compute column-wise sum
        for (int i = 0; i < cols; i++) {
            int cSum = 0;
            for (int j = 0; j < rows; j++) {
                cSum += arr[j][i];
            }
            System.out.println("Column " + (i + 1) + " sum = " + cSum);
        }

        System.out.println("Sum of all elements = " + sum);
        sc.close();
    }

}
