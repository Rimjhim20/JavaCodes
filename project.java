
import java.util.Scanner;

public class project {
    public static void main(String[] args) {

        // Team 2 - Super king - SOS Help desk (13)

        Scanner sc = new Scanner(System.in);
        int input, back, pincode, pincode1, case4;
        char case1, case2, case3, case5;

        System.out.println("\t\tWelcome to SOS help desk");
        System.out.println("==========================================================================");
        System.out.println();
        System.out.println("\t\tMAIN MENU");
        System.out.println("\t\t=========");

        System.out.println("1. Medical Realted Services.");
        System.out.println("2. Police - Related Services. ");
        System.out.println("3. Fire - Related Services.");
        System.out.println("4. Disaster Management Services.");
        System.out.println("5. Wildlife Helpline ");
        System.out.println("6. Quit");

        do {

            System.out.print("Enter your selection : ");
            input = sc.nextInt();

            switch (input) {

                case 1:
                    System.out.print("Is the patient badly wounded (Y/N) : ");
                    case1 = sc.next().charAt(0);
                    if (case1 == 'Y' || case1 == 'y') {
                        System.out.println("We will arrive at your location ASAP.");
                    } else if (case1 == 'N' || case1 == 'n') {
                        System.out.println("we will arrive at your location in 20 min. ");
                    } else {
                        System.out.println("Invalid input.");
                    }

                    System.out.print("Press 1 to go to menu and press 0 to exit : ");
                    back = sc.nextInt();

                    if (back == 1) {
                        continue;
                    } else {
                        input = 6;
                    }
                    break;

                case 2:
                    System.out.print("Is someone got robbed or been mudered (Y/N) : ");
                    case2 = sc.next().charAt(0);
                    if (case2 == 'Y' || case2 == 'y') {
                        System.out.println("We will arrive at your location ASAP.");
                    } else if (case2 == 'N' || case2 == 'n') {
                        System.out.println("Dont give unneccessary input. you have been reported. ");
                    } else {
                        System.out.println("Invalid input.");
                    }

                    System.out.print("Press 1 to go to menu and press 0 to exit : ");
                    back = sc.nextInt();

                    if (back == 1) {
                        continue;
                    } else {
                        input = 6;
                    }
                    break;

                case 3:
                    System.out.print("Is there a Fire emergency nearby (Y/N) : ");
                    case3 = sc.next().charAt(0);

                    if (case3 == 'Y' || case3 == 'y') {
                        System.out.print("Enter the pincode : ");
                        pincode = sc.nextInt();
                        System.out.println("Fire brigade has been sent to the given -> " + pincode + " pincode");
                    } else if (case3 == 'N' || case3 == 'n') {
                        System.out.println("Dont give unneccessary input. you have been reported. ");
                    } else {
                        System.out.println("Invalid input.");
                    }

                    System.out.print("Press 1 to go to menu and press 0 to exit : ");
                    back = sc.nextInt();

                    if (back == 1) {
                        continue;
                    } else {
                        input = 6;
                    }
                    break;

                case 4:
                    System.out.println("Press 1 if a building got collapsed ");
                    System.out.println("Press 2 if flood is there ");
                    System.out.println("Press 3 if someone need rescue after earthquake ");

                    System.out.print("SELECT : ");
                    case4 = sc.nextInt();

                    if (case4 == 1 || case4 == 2 || case4 == 3) {
                        System.out.println("Rescue team is on its way ");
                    } else {
                        System.out.println("Invalid input.");
                    }
                    System.out.print("Press 1 to go to menu and press 0 to exit : ");
                    back = sc.nextInt();

                    if (back == 1) {
                        continue;
                    } else {
                        input = 6;
                    }
                    break;

                case 5:
                    System.out.print("You have seen a wild animal roam free in public area (Y/N) : ");
                    case5 = sc.next().charAt(0);

                    if (case5 == 'Y' || case5 == 'y') {
                        System.out.print("Enter the pincode : ");
                        pincode1 = sc.nextInt();
                        System.out.println("Hunting team  has been sent to the given -> " + pincode1 + " pincode");
                    } else if (case5 == 'N' || case5 == 'n') {
                        System.out.println("Dont give unneccessary input. you have been reported. ");
                    } else {
                        System.out.println("Invalid input.");
                    }

                    System.out.print("Press 1 to go to menu and press 0 to exit : ");
                    back = sc.nextInt();

                    if (back == 1) {
                        continue;
                    } else {
                        input = 6;
                    }
                    break;

                case 6:
                    System.out.println("The program is closing........");
                    break;

                default:
                    System.out.println("Invalid input! . try again.");
            }

            sc.close();
        } while (input != 6);
    }
}