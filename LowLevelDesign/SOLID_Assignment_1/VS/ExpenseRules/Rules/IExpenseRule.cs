using ExpenseRules.Models;
namespace ExpenseRules.Rules
{
    public interface IExpenseRule
    {
        Violation? checkExpense(Expense expense);
    }
}
