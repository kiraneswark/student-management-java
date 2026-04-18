import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 5000.0;  // Initial account balance
        int choice;
        boolean exit = false;
        
        System.out.println("=== Welcome to Java ATM ===");
        System.out.println("Your initial balance: ₹" + balance);
        
        // Main loop - continues until user chooses to exit
        do {
            // Display menu
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Make your choice (1-4): ");
            
            choice = scanner.nextInt();
            
            // Conditional statements with switch
            switch (choice) {
                case 1:  // Check Balance
                    System.out.println("Your current balance: ₹" + balance);
                    break;
                    
                case 2:  // Withdraw Money
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    
                    // Nested conditional statements
                    if (withdrawAmount <= 0) {
                        System.out.println("Error: Amount must be greater than zero.");
                    } 
                    else if (withdrawAmount > balance) {
                        System.out.println("Error: Insufficient balance!");
                    } 
                    else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful! ₹" + withdrawAmount + " withdrawn.");
                        System.out.println("Remaining balance: ₹" + balance);
                    }
                    break;
                    
                case 3:  // Deposit Money
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    
                    if (depositAmount <= 0) {
                        System.out.println("Error: Amount must be greater than zero.");
                    } 
                    else {
                        balance += depositAmount;
                        System.out.println("Deposit successful! ₹" + depositAmount + " deposited.");
                        System.out.println("New balance: ₹" + balance);
                    }
                    break;
                    
                case 4:  // Exit
                    exit = true;
                    System.out.println("Thank you for using Java ATM. Goodbye!");
                    break;
                    
                default:  // Invalid choice
                    System.out.println("Invalid choice! Please select between 1 and 4.");
                    // Using continue to skip rest of loop and show menu again
                    continue;
            }
            
        } while (!exit);  // Looping statement: do-while
        
        scanner.close();
    }
}
    
