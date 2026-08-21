import java.util.*;

class Account {
    int AccountNo;
    String AccountHolderName;
    String AccountType;
    double balance;
    String BranchName;
    double minimumBalance;

    Account() {
    }

    Account(double balance) {
        this.balance = balance;
    }

    void SetDetail(Scanner sc, int accNo) {
        this.AccountNo = accNo;
        sc.nextLine(); // Clear newline from scanner

        System.out.print("Enter Account Holder Name: ");
        AccountHolderName = sc.nextLine();

        System.out.print("Enter Account Type: ");
        AccountType = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Branch Name: ");
        BranchName = sc.nextLine();

        System.out.print("Enter Minimum Balance: ");
        minimumBalance = sc.nextDouble();
        sc.nextLine();

        System.out.println("Account Created Successfully!\n");
    }

    void SetDetail(int AccountNo, String AccountHolderName, String AccountType, double balance, String BranchName, double minimumBalance) {
        this.AccountNo = AccountNo;
        this.AccountHolderName = AccountHolderName;
        this.AccountType = AccountType;
        this.balance = balance;
        this.BranchName = BranchName;
        this.minimumBalance = minimumBalance;
    }

    void getDetail() {
        System.out.println("\n      ACCOUNT DETAILS");
        System.out.println("Account Number  : " + AccountNo);
        System.out.println("Account Holder  : " + AccountHolderName);
        System.out.println("Account Type    : " + AccountType);
        System.out.println("Branch Name     : " + BranchName);
        System.out.println("Balance         : " + balance);
        System.out.println("Minimum Balance : " + minimumBalance);
        System.out.println();
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
        System.out.println("Current Balance : " + balance);
    }

    void withDraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        if (balance - amount < minimumBalance) {
            System.out.println("Withdrawal Failed!");
            System.out.println("Minimum balance of " + minimumBalance + " must be maintained.");
            return;
        }

        balance -= amount;
        System.out.println("Amount Withdrawn Successfully!");
        System.out.println("Current Balance : " + balance);
    }
}

public class qus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] accountArray = new Account[5];

        for (int i = 0; i < accountArray.length; i++) {
            accountArray[i] = new Account();
        }

        int choice;
        while (true) {
            System.out.println("\n          BANK MENU ");
            System.out.println("1. Set Details");
            System.out.println("2. Get Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number to set details: ");
                    int setAccNo = sc.nextInt();
                    Account setAccount = null;

                    
                    for (Account acc : accountArray) {
                        if (acc.AccountNo == setAccNo) {
                            setAccount = acc;
                            break;
                        }
                    }

                    if (setAccount == null) {
                        for (Account acc : accountArray) {
                            if (acc.AccountNo == 0) {
                                setAccount = acc;
                                break;
                            }
                        }
                    }

                    if (setAccount == null) {
                        System.out.println("All 5 accounts are already occupied!");
                    } else {
                        System.out.println("\nEnter Account Details:");
                        setAccount.SetDetail(sc, setAccNo);
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int getAccNo = sc.nextInt();
                    Account getAccount = findAccount(accountArray, getAccNo);
                    
                    if (getAccount == null) {
                        System.out.println("Account not found!");
                    } else {
                        getAccount.getDetail();
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int depositAccNo = sc.nextInt();
                    Account depositAccount = findAccount(accountArray, depositAccNo);

                    if (depositAccount == null) {
                        System.out.println("Account not found!");
                    } else {
                        System.out.print("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        depositAccount.deposit(amount);
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int withdrawAccNo = sc.nextInt();
                    Account withdrawAccount = findAccount(accountArray, withdrawAccNo);

                    if (withdrawAccount == null) {
                        System.out.println("Account not found!");
                    } else {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        withdrawAccount.withDraw(amount);
                    }
                    break;

                case 5:
                    System.out.println("Exiting........");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1-5.");
            }
        }
    }

    private static Account findAccount(Account[] accounts, int accNo) {
        if (accNo == 0) return null;
        for (Account acc : accounts) {
            if (acc.AccountNo == accNo) {
                return acc;
            }
        }
        return null;
    }
}