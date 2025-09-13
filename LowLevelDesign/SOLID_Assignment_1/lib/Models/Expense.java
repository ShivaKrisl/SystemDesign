package LowLevelDesign.SOLID_Assignment_1.lib.Models;

// Ideally Entity Class objects should be Initialized using a Builder Pattern
public class Expense {

    private final String expenseId;

    private final String tripId;

    private final double amount;

    private final ExpenseType expenseType;

    public Expense(String expenseId, String tripId, double amount, ExpenseType expenseType) {
        this.expenseId = expenseId;
        this.tripId = tripId;
        this.amount = amount;
        this.expenseType = expenseType;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public String getTripId() {
        return tripId;
    }

    public double getAmount() {
        return amount;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

}