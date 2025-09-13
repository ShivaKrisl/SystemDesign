using System;
using System.Collections.Generic;
using Models;
using Rules;
using Rules.ConcreteRules;
namespace Registery
{
    public class RuleRegistery
    {
        public static Dictionary<ExpenseType, List<IExpenseRule>> GetRuleRegisteryForIndividualExpenses()
        {
            Dictionary<ExpenseType, List<IExpenseRule>> expenseRules = new Dictionary<ExpenseType, List<IExpenseRule>>();

            expenseRules.Add(
                ExpenseType.RESTAURANT,
                new List<IExpenseRule>
                {
                    new MaxAmountRule(75),
                    new DisAllowRule()
                }
            );

            expenseRules.Add(
                ExpenseType.AIRFARE,
                new List<IExpenseRule>
                {
                    new DisAllowRule()
                }
            );
            return expenseRules;
        }

        public static List<IExpenseRule> GetRuleRegisteryCommonForAllExpenses()
        {
            List<IExpenseRule> commonExpenseRules = new List<IExpenseRule>
            {
                new MaxAmountRule(2000)
            };
            return commonExpenseRules;
        }


    }
}