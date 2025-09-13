using Rules;
namespace Rules.ConcreteRules
{
    public class MaxAmountRule : IExpenseRule
    {
        private readonly double _maxAmount;

        public MaxAmountRule(double maxAmount)
        {
            this._maxAmount = maxAmount;
        }

        public Violation? ValidateExpense(Models.Expense expense)
        {
            if (expense.Amount > this._maxAmount)
            {
                return Violation.CreateViolation($"Expense with Id {expense.GetExpenseId()} has amount {expense.GetAmount()} exceeds the maximum allowed amount of {_maxAmount}.");
            }
            return null;
        }
    }
}