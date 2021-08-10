import java.util.Scanner;
import java.util.Random;

public class project2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int choice;
        char a;
        System.out.println("Please select one option below");
        System.out.println("1. Greetings");
        System.out.println("2. List of Services");
        System.out.println("3. Leave message");
        System.out.println("4. Repeat menu");
        System.out.println("5. Quit");
        System.out.println("Enter your choice:- ");
        choice = sc.nextInt();
         
        switch (choice) {
            case 1: {

                System.out.print("Is the patient badly wounded (Y/N) : ");
                a = sc.next().charAt(0);
                if (a == 'Y' || a == 'y') {
                    System.out.println("We will arrive at your location ASAP.");
                } else if (a == 'N' || a == 'n') {
                    System.out.println("we will arrive at your location in 20 min. ");
                } else {
                    System.out.println("Invalid input.");
                }

                System.out.print("Press 1 to go to menu and press 0 to exit : ");
              //  back= sc.nextInt();
                System.out.println("Enter Name:-");
                String name = sc.next();
                System.out.println("Hey!" + name + ". Welcome to ITR \n");
               break;
            }

            case 2: {
                System.out.println("1.Banking");
                System.out.println("2.Student Management");
                System.out.println("Choose Option:- ");
                int opt = sc.nextInt();

                if (opt == 1) {
                    System.out.println("Select one option below ");
                    System.out.println("1. Open an Account");
                    System.out.println("2. Balance Enquiry");
                    System.out.println("3. Deposit");
                    System.out.println("4. Withdrawal");
                    System.out.println("5. Close an Account");
                    System.out.println("6. Quit");
                    System.out.println("\nEnter your option: ");
                    System.out.println("Choose Option:- ");
                    int option = sc.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Enter First Name: ");
                            String fname = sc.next();
                            System.out.println("Enter Last Name: ");
                            String lname = sc.next();

                            System.out.println("Enter initil Balance: \n");
                            float balance = sc.nextFloat();

                            System.out.println("Congratulation Account is Created\n");
                            System.out.println("FirstName:-" + fname);
                            System.out.println("Last Name:-" + lname);
                            System.out.println("Balance:-" + balance);
                            break;

                        case 2:
                            Random rand = new Random();
                            int rand_int1 = rand.nextInt(100000);
                            System.out.println("Enter Account Number:");
                            int accountnumber = sc.nextInt();

                            System.out.println("Your Account Details");
                            System.out.println("Accountnumber:-" + accountnumber);
                            System.out.println("Balance:-" + rand_int1);
                            break;

                        case 3:
                            System.out.println("Enter Account Number:");
                            accountnumber = sc.nextInt();

                            System.out.println("Enter Balance:");
                            float amount = sc.nextFloat();

                            System.out.println("Amount is Deposited");
                            System.out.println("AccountNumber:-" + accountnumber);
                            System.out.println("Amount:-" + amount);
                            break;
                        case 4:
                            System.out.println("Enter Account Number:");
                            accountnumber = sc.nextInt();
                            System.out.println("Enter Amount:");
                            amount = sc.nextFloat();

                            System.out.println("Amount Withdrawn");
                            System.out.println("AccountNumber:-" + accountnumber);
                            System.out.println("Amount:-" + amount);

                            break;
                        case 5:
                            System.out.println("Enter Account Number:-");
                            accountnumber = sc.nextInt();
                            System.out.println("AccountNumber:-" + accountnumber);
                            System.out.println("Account is Closed");

                        case 6:
                            break;
                        default:
                            System.out.println(
                                    "The options you entered are incorrect.We are unable to provide this service. Please try again.");

                    }

                } else if (opt == 2) {

                    System.out.println("----Welcome to the student management system----");
                    System.out.println("1. Add student information");
                    System.out.println("2. Modify student information");
                    System.out.println("3. Add and View your information");
                    System.out.println("4. Exit");
                    System.out.println("Please enter options:");
                    int chose = sc.nextInt();
                    System.out.println("Thank you for Your Confirmation");
                    int num;
                    String sname, age, address;
                    switch (chose) {

                        case 1: {
                            System.out.println("Enter student ID:");
                            num = sc.nextInt();
                            System.out.println("Enter name:");
                            sname = sc.next();
                            System.out.println("Enter age:");
                            age = sc.next();
                            System.out.println("Enter address:");
                            address = sc.next();
                            System.out.println("Student information added successfully!!\n");
                            break;
                        }

                        case 2:
                            System.out.println(
                                    "Enter the student ID of the student whose information needs to be modified:");
                            num = sc.nextInt();
                            System.out.println("Enter the student's new name:");
                            sname = sc.next();
                            System.out.println("Enter the student's new age:");
                            age = sc.next();
                            System.out.println("Enter the student's new address:");
                            address = sc.next();
                            break;

                        case 3:
                            System.out.println("Enter student ID:");
                            num = sc.nextInt();
                            System.out.println("Enter name:");
                            sname = sc.next();
                            System.out.println("Enter age:");
                            age = sc.next();
                            System.out.println("Enter address:");
                            address = sc.next();
                            System.out.println("Student information added successfully!!\n");
                            System.out.println("Student ID:" + num);
                            System.out.println("Name:" + sname);
                            System.out.println("Age::" + age);
                            System.out.println("Address:" + address);
                            break;

                        case 4:
                            System.out.println("Thank you for using");
                            System.exit(0);

                        default:
                            System.out.println("The options you entered are incorrect. Please try again.");

                    }

                }
                break;
            }

            case 3: {

                System.out.println("Write your message:");
                String msg = s.nextLine();
                System.out.print("\n");
                System.out.print("Your message:-" + msg);
                System.out.print("\n\n\n");
                System.out.print(
                        "ITR Message:-Thank You. We have recieved your message.Our support executive will get back to you shortly.\n\n");

            }
            case 4: {

                System.out.println("Please select one option below");
                System.out.println("1. Greetings");
                System.out.println("2. List of Services");
                System.out.println("3. Leave message");
                System.out.println("4. Repeat menu");
                System.out.println("5. Quit");
                System.out.println("Enter your choice:- ");
                choice = sc.nextInt();
                break;
            }
            case 5: {
                System.out.println("Thank you for using!!\n");
                System.exit(0);

            }
            default:
                System.out.println(
                        "The options you entered are incorrect.We are unable to provide this service. Please try again.");
        }

        s.close();
        sc.close();
    }

}