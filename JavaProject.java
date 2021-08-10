
import java.util.Scanner;
import java.util.Random;

public class JavaProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int choice, opt, option;
        do {
            System.out.println();
            System.out.println("*************** Main Menu ******************");
            System.out.println("=========================================");
            System.out.println();
            System.out.println("Please select one option below");
            System.out.println("1. Greetings");
            System.out.println("2. List of Services");
            System.out.println("3. Give Feedback");
            System.out.println("4. Quit");
            System.out.println("5.Choose language");
            System.out.println("----------------------");
            System.out.print("Enter your choice :- ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("You entered 1");
                    System.out.print("Enter Name : ");
                    String name = s.nextLine();
                    System.out.println("Hey!" + name + ". Welcome to ITR");
                    System.out.println("--------------------------------------------");
                    System.out.print("press 1 for Main menu and 0 to Exit program: ");
                    int back = sc.nextInt();
                    if (back == 1) {
                        continue;
                    } else {
                        System.out.println("---------------------------------");
                        System.out.println("Thanks for using the program");
                        System.out.println("You have succesfully logged out.");
                        System.out.println("---------------------------------");
                        choice = 4;
                    }
                    break;
                }
                case 2:
                System.out.print("You entered 2");
                    System.out.println("-------------------------");
                    System.out.println("1.Banking");
                    System.out.println("2.Student Management");
                    System.out.println("-------------------------");
                    System.out.print("Choose Option : ");
                    opt = sc.nextInt();
                    if (opt == 1) {

                        int t = 0;
                        do {
                            System.out.println();
                            System.out.println("----------------------------");
                            System.out.println("Select one option below ");
                            System.out.println("1. Open an Account");
                            System.out.println("2. Balance Enquiry");
                            System.out.println("3. Deposit");
                            System.out.println("4. Withdrawal");
                            System.out.println("5. Close an Account");
                            System.out.println("6. Go back to Menu.");
                            System.out.println("7. Exit program ");
                            System.out.println("-----------------------------");
                            System.out.print("Enter your Option :  ");
                            option = sc.nextInt();
                            System.out.println("-----------------------------");
                            switch (option) {
                                case 1:
                                    System.out.print("Enter Your Name : ");
                                    String name = s.nextLine();
                                    System.out.print("Enter initil Balance : ");
                                    float balance = sc.nextFloat();
                                    System.out.println("-----------------------------------");
                                    System.out.println("Congratulation Account is Created\n");
                                    System.out.println("Name :  " + name);
                                    System.out.println("Balance : " + balance);
                                    System.out.println("-----------------------------------");
                                    System.out.print(
                                            "Press 1 to go previous menu and press 2 for Main menu and press 0 to exit : ");
                                    t = sc.nextInt();
                                    if (t == 1) {
                                        continue;
                                    } else if (t == 2) {
                                        option = 6;
                                    } else {
                                        System.out.println("---------------------------------");
                                        System.out.println("Thanks for using the program");
                                        System.out.println("You have succesfully logged out.");
                                        System.out.println("---------------------------------");
                                        t = 4;
                                        choice = 4;
                                    }
                                    break;
                                case 2:
                                    Random rand = new Random();
                                    int rand_int1 = rand.nextInt(100000);
                                    System.out.print("Enter Account Number:");
                                    long accountnumber = sc.nextLong();
                                    System.out.println("-----------------------------------");
                                    System.out.println("Your Account Details");
                                    System.out.println("Accountnumber : " + accountnumber);
                                    System.out.println("Balance : " + rand_int1);
                                    System.out.println("-----------------------------------");
                                    System.out.print(
                                            "Press 1 to go previous menu and press 2 for Main menu 0 to exit program : ");
                                    t = sc.nextInt();
                                    if (t == 1) {
                                        continue;
                                    } else if (t == 2) {
                                        t = 4;
                                    } else {
                                        System.out.println("---------------------------------");
                                        System.out.println("Thanks for using the program");
                                        System.out.println("You have succesfully logged out.");
                                        System.out.println("---------------------------------");
                                        t = 4;
                                        choice = 4;
                                    }
                                    break;
                                case 3:
                                    System.out.print("Enter Account Number :");
                                    accountnumber = sc.nextLong();
                                    System.out.print("Enter Balance :");
                                    float amount = sc.nextFloat();
                                    System.out.println("-----------------------------------");
                                    System.out.println("Amount is Deposited");
                                    System.out.println("AccountNumber:-" + accountnumber);
                                    System.out.println("Amount:-" + amount);
                                    System.out.println("-----------------------------------");
                                    System.out.print(
                                            "Press 1 to go previous menu and press 2 for Main menu and 0 to exit program : ");
                                    t = sc.nextInt();
                                    if (t == 1) {
                                        continue;
                                    } else if (t == 2) {
                                        t = 4;
                                    } else {
                                        System.out.println("---------------------------------");
                                        System.out.println("Thanks for using the program");
                                        System.out.println("You have succesfully logged out.");
                                        System.out.println("---------------------------------");
                                        t = 4;
                                        choice = 4;
                                    }
                                    break;
                                case 4:
                                    System.out.print("Enter Account Number : ");
                                    accountnumber = sc.nextLong();
                                    System.out.print("Enter Amount : ");
                                    amount = sc.nextFloat();
                                    System.out.println("-----------------------------------");
                                    System.out.println("Amount Withdrawn");
                                    System.out.println();
                                    System.out.println("AccountNumber : " + accountnumber);
                                    System.out.println("Amount : " + amount);
                                    System.out.println("-----------------------------------");
                                    System.out.print(
                                            "Press 1 to go previous menu and press 2 for Main menu 0 to exit program : ");
                                    t = sc.nextInt();
                                    if (t == 1) {
                                        continue;
                                    } else if (t == 2) {
                                        t = 4;
                                    } else {
                                        System.out.println("---------------------------------");
                                        System.out.println("Thanks for using the program");
                                        System.out.println("You have succesfully logged out.");
                                        System.out.println("---------------------------------");
                                        t = 4;
                                        choice = 4;
                                    }
                                    break;
                                case 5:
                                    System.out.print("Enter Account Number : ");
                                    accountnumber = sc.nextLong();
                                    System.out.println("-----------------------------------");
                                    System.out.println("AccountNumber : " + accountnumber);
                                    System.out.println("Account is Closed");
                                    System.out.println("-----------------------------------");
                                    System.out.print(
                                            "Press 1 to go previous menu and press 2 for Main menu 0 to exit program : ");
                                    t = sc.nextInt();
                                    if (t == 1) {
                                        continue;
                                    } else if (t == 2) {
                                        t = 4;
                                    } else {
                                        System.out.println("---------------------------------");
                                        System.out.println("Thanks for using the program");
                                        System.out.println("You have succesfully logged out.");
                                        System.out.println("---------------------------------");
                                        t = 4;
                                        choice = 4;
                                    }
                                case 6:
                                    t = 4;
                                    break;

                                case 7:
                                    System.out.println("---------------------------------");
                                    System.out.println("Thanks for using the program");
                                    System.out.println("You have succesfully logged out.");
                                    System.out.println("---------------------------------");
                                    t = 4;
                                    choice = 4;
                                    break;
                                default:
                                    System.out.println(
                                            "----------------------------------------------------------------------------------------------");
                                    System.out.println(
                                            "The options you entered are incorrect.We are unable to provide this service. Please try again.");
                                    System.out.println(
                                            "----------------------------------------------------------------------------------------------");
                            }
                        } while (t != 4);
                    } else if (opt == 2) {
                        int chose, t;
                        do {
                            System.out.println();
                            System.out.println("----Welcome to the student management system----");
                            System.out.println("1. Add and View your information");
                            System.out.println("2. Modify student information");
                            System.out.println("3. Delete student information");
                            System.out.println("4. Go back to menu");
                            System.out.println("5. Exit program");
                            System.out.println("-----------------------------");
                            System.out.print("Please enter options : ");
                            chose = sc.nextInt();
                            System.out.println();
                            int num;
                            String sname, age, address;
                            switch (chose) {
                                case 1: {
                                    System.out.print("Enter student ID : ");
                                    num = sc.nextInt();
                                    System.out.print("Enter name : ");
                                    sname = s.nextLine();
                                    System.out.print("Enter age : ");
                                    age = sc.next();
                                    System.out.print("Enter address : ");
                                    address = sc.next();
                                    System.out.println("Student information added successfully!!\n");
                                    System.out.println("------------Displaying information-------------");
                                    System.out.println("Student ID:" + num);
                                    System.out.println("Name :" + sname);
                                    System.out.println("Age :" + age);
                                    System.out.println("Address :" + address);
                                    System.out.println("-------------------------------");
                                    System.out.print(
                                            "Press 1 to go previous menu and press 2 for Main menu 0 to exit program : ");
                                    t = sc.nextInt();
                                    if (t == 1) {
                                        continue;
                                    } else if (t == 2) {
                                        chose = 4;
                                    } else {
                                        System.out.println("---------------------------------");
                                        System.out.println("Thanks for using the program");
                                        System.out.println("You have succesfully logged out.");
                                        System.out.println("---------------------------------");
                                        t = 4;
                                        chose = 4;
                                        choice = 4;
                                    }

                                    break;
                                }
                                case 2:
                                    System.out.print(
                                            "Enter the student ID of the student whose information needs to be modified : ");
                                    num = sc.nextInt();
                                    System.out.print("Enter the student's new name : ");
                                    sname = s.nextLine();
                                    System.out.print("Enter the student's new age : ");
                                    age = sc.next();
                                    System.out.print("Enter the student's new address : ");
                                    address = sc.next();
                                    System.out.println("-------------------------");
                                    System.out.println("Modified infromation --  ");
                                    System.out.println("-------------------------");
                                    System.out.println("Student ID:" + num);
                                    System.out.println("Name :" + sname);
                                    System.out.println("Age :" + age);
                                    System.out.println("Address :" + address);
                                    System.out.println("-------------------------------");
                                    System.out.print(
                                            "Press 1 to go previous menu and press 2 for Main menu 0 to exit program : ");
                                    t = sc.nextInt();
                                    if (t == 1) {
                                        continue;
                                    } else if (t == 2) {
                                        chose = 4;
                                    } else {
                                        System.out.println("---------------------------------");
                                        System.out.println("Thanks for using the program");
                                        System.out.println("You have succesfully logged out.");
                                        System.out.println("---------------------------------");
                                        t = 4;
                                        chose = 4;
                                        choice = 4;
                                    }

                                    break;
                                case 3:
                                    System.out.print("Enter the student ID whose information you want to delete : ");
                                    num = sc.nextInt();
                                    System.out.println("All Information realted to this ID - " + num + " is deleted. ");
                                    System.out.println("-------------------------------");
                                    System.out.print(
                                            "Press 1 to go previous menu and press 2 for Main menu 0 to exit program : ");
                                    t = sc.nextInt();
                                    if (t == 1) {
                                        continue;
                                    } else if (t == 2) {
                                        chose = 4;
                                    } else {
                                        System.out.println("---------------------------------");
                                        System.out.println("Thanks for using the program");
                                        System.out.println("You have succesfully logged out.");
                                        System.out.println("---------------------------------");
                                        t = 4;
                                        chose = 4;
                                        choice = 4;
                                    }
                                    break;

                                case 4:
                                    break;

                                case 5:
                                    System.out.println("---------------------------------");
                                    System.out.println("Thanks for using the program");
                                    System.out.println("You have succesfully logged out.");
                                    System.out.println("---------------------------------");
                                    chose = 4;
                                    choice = 4;
                                    break;

                                default:
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("The options you entered are incorrect. Please try again.");
                                    System.out.println("------------------------------------------------------------");

                                    break;
                            }
                        } while (chose != 4);
                    } else {
                        System.out.println(
                                "----------------------------------------------------------------------------------------------");
                        System.out.println(
                                "The options you entered are incorrect.We are unable to provide this service. Please try again.");
                        System.out.println(
                                "----------------------------------------------------------------------------------------------");
                    }
                    break;

                case 3: {
                    System.out.println("-------------------------");
                    System.out.print("Write your Feedback : ");
                    String msg = s.nextLine();
                    System.out.print("\n");
                    System.out.print("Your Feedback :-" + msg);
                    System.out.print("\n");
                    System.out.print("ITR Message:-Thank You. We have recieved your Feedback .");
                    System.out.println();
                    System.out.println("-----------------------------------");
                    System.out.print("Press 1 for Main menu and press 0 to Exit program : ");
                    int back = sc.nextInt();
                    if (back == 1) {
                        continue;
                    } else {
                        System.out.println("---------------------------------");
                        System.out.println("Thanks for using the program");
                        System.out.println("You have succesfully logged out.");
                        System.out.println("---------------------------------");
                        choice = 4;
                    }
                    break;
                }
                case 4: {
                    System.out.println("---------------------------------");
                    System.out.println("Thanks for using the program");
                    System.out.println("You have succesfully logged out.");
                    System.out.println("---------------------------------");
                    break;
                }
                case 5: {
                    System.out.println("---------------------------------");
                    System.out.println("Choose Language");
                    System.out.println("1.English");
                    System.out.println("2.Hindi");
                    System.out.println("2.French");
                    int optlang = sc.nextInt();
                    System.out.println();
                    int num;
                    String sname, age, address;
                    switch (optlang) {
                        case 1: {
                       
                    }


                }
                default:
                    System.out.println(
                            "----------------------------------------------------------------------------------------------");
                    System.out.println(
                            "The options you entered are incorrect.We are unable to provide this service. Please try again.");
                    System.out.println(
                            "----------------------------------------------------------------------------------------------");
            }
            sc.close();
            s.close();
        } while (choice != 4);

    }
}
