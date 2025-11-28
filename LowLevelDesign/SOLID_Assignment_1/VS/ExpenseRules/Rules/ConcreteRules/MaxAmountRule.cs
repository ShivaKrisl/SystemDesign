using ExpenseRules.Models;

namespace ExpenseRules.Rules.ConcreteRules
{
    public class MaxAmountRule : IExpenseRule
    {
        private readonly decimal _amount;

        public MaxAmountRule(decimal amount)
        {
            _amount = amount;
        }

        public Violation? checkExpense(Expense expense)
        {
            if(expense.GetExpenseAmount() > this._amount)
            {
                return new Violation($"Expense Type {expense.GetExpenseType()} exceeds max allocated amount {this._amount}");
            }
            return null;
        }
    }
}
