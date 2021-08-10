package Array;

import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows in matrix");
        int m = s.nextInt();
        System.out.println("Enter number of coulmns in matrix");
        int n = s.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter " + m * n + " elements of matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }

        }
        // second matrix
        System.out.println("Enter number of rows in second matrix");
        int o = s.nextInt();
        System.out.println("Enter number of coulmns in second matrix");
        int p = s.nextInt();
        int[][] b = new int[o][p];
        System.out.println("Enter " + o * p + " elements of matrix");
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = s.nextInt();
            }

        }

        System.out.println("Entered elements in first matrix=");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Entered elements in second matrix=");
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }

        /* for Addition of matrix */
        if (m == o && n == p) {
            int[][] c = new int[m][n];
            System.out.println("Addition of two matrix =");
            for (int i = 0; i < m; i++) {

                for (int j = 0; j < n; j++) {
                    c[i][j] = 0;
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print(" " + c[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Addition of these matrix not prossible");
        }
        s.close();
    }

}