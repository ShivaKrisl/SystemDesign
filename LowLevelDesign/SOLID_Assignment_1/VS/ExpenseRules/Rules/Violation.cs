namespace ExpenseRules.Rules
{
    public class Violation
    {
        private readonly string _message;

        public Violation(string message)
        {
            this._message = message;
        }

        public static Violation ReturnViolationOf(string message)
        {
            return new Violation(message);
        }
    }
}
