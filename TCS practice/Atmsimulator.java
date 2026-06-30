import java.util.Scanner;

public class Atmsimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPin = "1234";
        int balance = 10000;

        System.out.print("Enter your 4 digit pin: ");
        String pin = sc.nextLine();

        if (pin.equals(correctPin)) {
            System.out.println("Welcome");

            while (true) {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1/2/3/4): ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Your current balance is: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter your withdraw amount: ");
                        int withdraw = sc.nextInt();

                        if (withdraw % 100 != 0 || withdraw <= 0) {
                            System.out.println("Please enter valid amount");
                        } else if (withdraw > balance) {
                            System.out.println("Insufficient Balance");
                        } else {
                            balance -= withdraw;
                            System.out.println("Withdraw successful");
                        }
                        break;

                    case 3:
                        System.out.print("Enter your Deposit amount: ");
                        int deposit = sc.nextInt();

                        if (deposit % 100 != 0 || deposit <= 0 || deposit >= 40000) {
                            System.out.println("Please enter valid amount");
                        } else {
                            balance += deposit;
                            System.out.println("Deposit successful");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Option");
                }
            }

        } else {
            System.out.println("Access Denied! Incorrect PIN.");
        }

        sc.close();
    }
}