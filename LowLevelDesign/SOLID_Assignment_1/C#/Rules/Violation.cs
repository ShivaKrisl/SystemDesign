namespace Rules
{
    public class Violation
    {
        private string _violationMessage;
        public Violation(string message)
        {
            this._violationMessage = message;
        }

        public static Violation CreateViolation(string message)
        {
            return new Violation(message);
        }
    }
}