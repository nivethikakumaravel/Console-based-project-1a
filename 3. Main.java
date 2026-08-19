import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;
        do {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance Check");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Account ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double balance = sc.nextDouble();
                    if (bank.createAccount(id, name, balance)) {
                        System.out.println("Account created successfully");
                    } else {
                        System.out.println("Account ID already exists");
                    }
                    break;
                case 2:
                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    bank.deposit(id, amount);
                    break;
                case 3:
                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    amount = sc.nextDouble();
                    bank.withdraw(id, amount);
                    break;
                case 4:
                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();
                    bank.checkBalance(id);
                    break;
                case 5:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
