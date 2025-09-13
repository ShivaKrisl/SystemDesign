namespace Models
{
    public class Expense
    {
        private string ExpenseId { get; set; }

        private string TripId { get; set; }

        private double Amount { get; set; }

        private ExpenseType ExpenseType { get; set; }

        public Expense(string expenseId, string tripId, double amount, ExpenseType expenseType)
        {
            ExpenseId = expenseId;
            TripId = tripId;
            Amount = amount;
            ExpenseType = expenseType;
        }

        public string GetExpenseId()
        {
            return ExpenseId;
        }
        public string GetTripId()
        {
            return TripId;
        }
        public double GetAmount()
        {
            return Amount;
        }
        public ExpenseType GetExpenseType()
        {
            return ExpenseType;
        }
    }
}