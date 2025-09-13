using Models;
namespace Rules
{
    public interface IExpenseRule
    {
        Violation? ValidateExpense(Expense expense);
    }
}