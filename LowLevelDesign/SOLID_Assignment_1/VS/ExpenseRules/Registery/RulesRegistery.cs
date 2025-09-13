using ExpenseRules.Models;
using ExpenseRules.Rules;
using ExpenseRules.Rules.ConcreteRules;

namespace ExpenseRules.Registery
{
    public class RulesRegistery
    {
        public static void GetRuleRegiseryForIndividualExpense()
        {
            Dictionary<ExpenseType, List<IExpenseRule>> expenseRules = new Dictionary<ExpenseType, List<IExpenseRule>>();

            expenseRules.Add(
                ExpenseType.AIRFARE,
                new List<IExpenseRule>()
                {
                    new DisAllowRule()
                }
            );

            expenseRules.Add(
                ExpenseType.RESTAURANT,
                new List<IExpenseRule>()
                {
                    new MaxAmountRule(75),
                    new DisAllowRule()
                }
            );
        }

        public static List<IExpenseRule> GetRegisteryCommonForAllExpenses()
        {
            List<IExpenseRule> expenseRules = new List<IExpenseRule>();

            expenseRules.Add(new MaxAmountRule(2000));

            return expenseRules;
        }
    }
}
