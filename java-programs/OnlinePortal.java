import java.util.Scanner;

public class OnlinePortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Login (simple)
        System.out.println("Enter username:");
        String user = sc.next();

        System.out.println("Login successful!\n");

        // Create objects
        Customer c = new Customer("P", 101010);
        Savings s = new Savings(1000);
        Loan l = new Loan(5000);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Savings");
            System.out.println("2. Loan");
            System.out.println("3. Customer Details");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    int sChoice;
                    System.out.println("\n--- Savings Menu ---");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Interest");
                    System.out.println("4. Balance");
                    sChoice = sc.nextInt();

                    switch (sChoice) {
                        case 1:
                            System.out.print("Enter amount: ");
                            s.deposit(sc.nextDouble());
                            break;
                        case 2:
                            System.out.print("Enter amount: ");
                            s.withdraw(sc.nextDouble());
                            break;
                        case 3:
                            s.interest();
                            break;
                        case 4:
                            s.showBalance();
                            break;
                    }
                    break;

                case 2:
                    int lChoice;
                    System.out.println("\n--- Loan Menu ---");
                    System.out.println("1. Credit Loan");
                    System.out.println("2. Balance");
                    lChoice = sc.nextInt();

                    switch (lChoice) {
                        case 1:
                            System.out.print("Enter loan amount: ");
                            l.credit(sc.nextDouble());
                            break;
                        case 2:
                            l.showBalance();
                            break;
                    }
                    break;

                case 3:
                    c.showBasicDetails();
                    c.showAccountDetails(s, l);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}