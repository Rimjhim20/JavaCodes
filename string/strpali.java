package string;

import java.util.Scanner;

class strpali {

    public static void main(String args[]) {

        String original, reverse = "";

        int opt;

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Enter a string/number to check if it is a palindrome");

            original = in.nextLine();

            int length = original.length();

            for (int i = length - 1; i >= 0; i--) {

                reverse = reverse + original.charAt(i);

            }

            if (original.equals(reverse)) {

                System.out.println("Entered string/number is a palindrome.");

            }

            else {

                System.out.println("Entered string/number isn't a palindrome.");

            }

            System.out.println("Press for 1 for continue");

            opt = in.nextInt();

            in.nextLine();

        } while (opt == 1); // end of while
        in.close();
    }

}