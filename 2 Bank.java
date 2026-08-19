import java.util.ArrayList;
public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    public boolean createAccount(int id, String name, double balance) {
        for (Account account : accounts) {
            if (account.getAccountId() == id) {
                return false;
            }
        }
        accounts.add(new Account(id, name, balance));
        return true;
    }
    public Account findAccount(int id) {
        for (Account account : accounts) {
            if (account.getAccountId() == id) {
                return account;
            }
        }
        return null;
    }
    public void deposit(int id, double amount) {
        Account account = findAccount(id);
        if (account == null) {
            System.out.println("Account not found");
        } else {
            account.deposit(amount);
        }
    }
    public void withdraw(int id, double amount) {
        Account account = findAccount(id);
        if (account == null) {
            System.out.println("Account not found");
        } else {
            account.withdraw(amount);
        }
    }
    public void checkBalance(int id) {
        Account account = findAccount(id);
        if (account == null) {
            System.out.println("Account not found");
        } else {
            System.out.println("Account ID: " + account.getAccountId());
            System.out.println("Name: " + account.getName());
            System.out.println("Balance: " + account.getBalance());
        }
    }
}
