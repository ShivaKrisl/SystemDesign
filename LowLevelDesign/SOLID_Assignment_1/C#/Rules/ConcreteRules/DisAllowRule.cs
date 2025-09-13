namespace Rules.ConcreteRules
{
    public class DisAllowRule : IExpenseRule
    {
        public Violation? ValidateExpense(Models.Expense expense)
        {
            return Violation.CreateViolation($"Expense with type {expense.GetExpenseType()} is not allowed.");
        }
    }
}