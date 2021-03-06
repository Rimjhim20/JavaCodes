package string;

import java.util.Scanner;

public class stringpalindrome {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string");
        String str = s.next();

        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
        s.close();

    }
}
