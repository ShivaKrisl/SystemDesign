using ExpenseRules.Models;

namespace ExpenseRules.Rules
{
    public interface ITripRule
    {
        List<Violation>? CheckTripViolation(List<Expense> expenses);
    }
}
