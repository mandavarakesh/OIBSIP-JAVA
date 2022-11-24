// create atm application with transaction history

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int balance = 10000;
            int withdraw = 0;
            int deposit = 0;
            int choice;
            int transaction = 1;
            int pin = 1234;
            int entry;
            int count = 0;

            System.out.println("Welcome to ATM");
            System.out.println("Enter your pin number");
            entry = input.nextInt();
            while (entry != pin) {
                System.out.println("Incorrect pin");
                count++;
                if (count == 3) {
                    System.out.println("You have entered wrong pin 3 times");
                    return;
                }
                System.out.println("Enter your pin number");
                entry = input.nextInt();
            }
            do {
                System.out.println("\n********Welcome to ATM Service**************\n");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Previous Transaction");
                System.out.println("5. Exit");
                System.out.println("Enter your choice");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Balance = " + balance);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw");
                        withdraw = input.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                        } else {
                            System.out.println("Insufficient balance");
                        }
                        System.out.println("");
                        transaction = 2;
                        break;
                    case 3:
                        System.out.println("Enter amount to deposit");
                        deposit = input.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your money has been successfully deposited");
                        System.out.println("");
                        transaction = 3;
                        break;
                    case 4:
                        switch (transaction) {
                            case 1:
                                System.out.println("You have not done any transaction");
                                break;
                            case 2:
                                System.out.println("You have withdrawn " + withdraw);
                                break;
                            case 3:
                                System.out.println("You have deposited " + deposit);
                                break;
                        }
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("Thank you for using our ATM");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                System.out.println("Do you want to continue? (y/n)");
                System.out.println("\n*******************************************\n");
            } while (input.next().equals("y"));
        }
    }
