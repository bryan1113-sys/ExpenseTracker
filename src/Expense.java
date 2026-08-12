/*
 A class that creates an Expense
 */

public class Expense {
    // Establish variables
    private String description;
    private double amount;

    // Accessing those variables
    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    // a method to return the description
    public String getDescription() {
        return description;
    }

    // a method to return the amount
    public double getAmount() {
        return amount;
    }
}
