namespace ExpenseRules.Models
{
    public class Expense
    {
        private string ExpenseId { get; set; }

        private string TripId { get; set; }

        private decimal Amount { get; set; }

        private ExpenseType ExpenseType { get; set; }

        public Expense(string expenseId, string tripId, decimal amount, ExpenseType expenseType)
        {
            ExpenseId = expenseId;
            TripId = tripId;
            Amount = amount;
            ExpenseType = expenseType;
        }

        public string GetExpenseId()
        {
            return this.ExpenseId;
        }

        public string GetTripId()
        {
            return this.TripId;
        }

        public string GetExpenseType()
        {
            return this.ExpenseType.ToString();
        }

        public decimal GetExpenseAmount()
        {
            return this.Amount;
        }
    }
}
