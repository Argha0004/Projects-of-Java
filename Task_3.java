// Task_3(ATM INTERFACE)

import java.util.*;

class ATM {
    float balance;
    int PIN = 4161;

    public void checkPin() {
        System.out.println("*****************Welcome to all in my ATM Interface*****************");
        System.out.print("\nEnter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.print("Enter valid pin!!");
            menu();
        }
    }

    public void menu() {
        System.out.print("\nEnter your choice:- ");
        System.out.print("\n1. Check A/C Balance");
        System.out.print("\n2. Withdraw Money");
        System.out.print("\n3. Deposit Money");
        System.out.println("\n4. Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            checkBalance();
        } else if (option == 2) {
            withdrawMoney();
        } else if (option == 3) {
            depositMoney();
        } else if (option == 4) {
            return;
        } else {
            System.out.print("Enter a valid choice");
        }
    }

    public void checkBalance() {
        System.out.print("\nBalance: " + balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.print("\nEnter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > balance) {
            System.out.print("\nInsufficient Balance");
        } else {
            balance -= amount;
            System.out.print("\nMoney Withdrawl Successfully");
        }
        menu();
    }

    public void depositMoney() {
        System.out.print("\nEnter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        balance += amount;
        System.out.print("\nMoney Deposited Successfully");
        menu();
    }

}

public class Task_3 {
    public static void main(String[] args) {
        /*
            Road Map:- 
            1. Initialization balance and PIN veriable.
            2. Check our PIN that what? wrong or right
            3. Create a small Menu Bar.
            4. Adding some attributes likes-> Check A/C Balance, Withdraw, Deposit, Exit.
            5. Create 4 function class for 4 attrinutes.
            6. After a all work we exit the function.
         */

        ATM obj = new ATM();
        obj.checkPin();
    }
}
