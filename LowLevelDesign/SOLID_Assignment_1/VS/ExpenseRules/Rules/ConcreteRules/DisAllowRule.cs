using ExpenseRules.Models;

namespace ExpenseRules.Rules.ConcreteRules
{
    public class DisAllowRule : IExpenseRule
    {
        Violation? IExpenseRule.checkExpense(Expense expense)
        {
            return new Violation($"Expense of Type {expense.GetExpenseType()} is not allowed.");
        }
    }
}
