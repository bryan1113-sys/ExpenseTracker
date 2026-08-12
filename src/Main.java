import java.util.ArrayList;
import java.util.Scanner;

/*
    Main program for an expense tracker as I reintroduce myself to Java and programming practices
 */
public class Main {
    public static void main(String[] args) {

        // Creating variables for name, ag, and balance
        String name = "Bryan";
        int age = 27;
        double balance = 1250.50;

        // Printing the variables previously created
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);

        // Creating variable to utilize methods
        double totalExpenses = 0;

        // Calling method that adds expenses
        totalExpenses = addExpense(totalExpenses, 25.50);
        totalExpenses = addExpense(totalExpenses, 40.00);

        // Printing the result
        System.out.println("Total expenses: $" + totalExpenses);

        // Establish array list to hold Expense class
        ArrayList<Expense> expenses = new ArrayList<>();

        // Adding Expenses to this array list
        expenses.add(new Expense("Gas", 45.00));
        expenses.add(new Expense("Lunch", 12.50));
        expenses.add(new Expense("Groceries", 78.25));

        // Printing this ArrayList to test
        for (Expense expense : expenses) {
            System.out.println(expense.getDescription() + ": $" + expense.getAmount());
        }

        // Adding the expenses
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        // Printing the result of the added expenses
        System.out.println("Total: $" + total);

        // Creating a scanner to accept user input
        Scanner scanner = new Scanner(System.in);

        // Creating a boolean to run program until user ends it
        boolean running = true;

        // Menu
        while (running) {
            System.out.println("\n--- Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Request user input for expense description
                    System.out.print("Enter expense description: ");
                    String description = scanner.nextLine();

                    // Request user input for expense amount
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();

                    // Add user generated expenses to the ArrayList
                    expenses.add(new Expense(description, amount));

                    System.out.println("Expense Added!");
                    break;

                case 2:
                    System.out.println("\n--- Expenses ---");

                    // Print expenses
                    for (Expense expense : expenses) {
                        System.out.println(expense.getDescription() + ": $" + expense.getAmount());
                    }
                    break;

                case 3:
                    // zeroing total
                    total = 0;

                    // Add up new total
                    for (Expense expense : expenses) {
                        total += expense.getAmount();
                    }

                    // Display total
                    System.out.println("Total: $" + total);
                    break;

                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("That option is not implemented yet.");
            }
        }
    }

    // Method to add an expense to the given total
    public static double addExpense(double total, double expense) {
        return total + expense;
    }
}