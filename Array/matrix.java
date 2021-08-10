package Array;
//2 dimensional array
import java.util.Scanner;

class matrix {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of rows in 1st matrix");

        int m = s.nextInt();

        System.out.println("Enter number of coulmns in 1st matrix");

        int n = s.nextInt();

        int[][] arr= new int[m][n];

        System.out.println("Enter " + m * n + " elements of matrix");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                arr[i][j] = s.nextInt();

            }
        }

        System.out.println("Enter number of rows in 2nd matrix");

        int m1 = s.nextInt();

        System.out.println("Enter number of coulmns in 2nd matrix");

        int n1 = s.nextInt();

        int[][] arr1= new int[m1][n1];

        System.out.println("Enter " + m1 * n1 + " elements of matrix");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                arr1[i][j] = s.nextInt();

            }
        }

        System.out.println("Enter elements in 1st matrix=");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(" " + arr[i][j]);

            }

            System.out.println();

        }

        System.out.println("Enter elements in 2nd matrix=");

        for (int i = 0; i < m1; i++) {

            for (int j = 0; j < n1; j++) {

                System.out.print(" " + arr1[i][j]);

            }

            System.out.println();

        }
        s.close();
    }
}