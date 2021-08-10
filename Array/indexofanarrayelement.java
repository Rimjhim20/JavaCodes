package Array;

import java.util.Scanner;

class indexofanarrayelement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of list");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element in array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter element to be search");
        int m = s.nextInt();
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                isFound = true;
                System.out.println("Element has found at the index of " + i);
                break;
            }
        }
        if (isFound == false) {
            System.out.println("Search element does not exist in list");
        }
        s.close();
    }
}
