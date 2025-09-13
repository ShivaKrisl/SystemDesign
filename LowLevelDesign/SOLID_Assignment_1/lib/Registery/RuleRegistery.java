package LowLevelDesign.SOLID_Assignment_1.lib.Registery;

import java.util.HashMap;
import java.util.List;

import LowLevelDesign.SOLID_Assignment_1.lib.Models.ExpenseType;
import LowLevelDesign.SOLID_Assignment_1.lib.Rules.IExpenseRule;
import LowLevelDesign.SOLID_Assignment_1.lib.Rules.Implementations.DisAllowRule;
import LowLevelDesign.SOLID_Assignment_1.lib.Rules.Implementations.MaxAmountRule;

// acts as config for expense type and their rules
public class RuleRegistery {
    public static void getRegisteryForIndividualExpense() {
        HashMap<ExpenseType, List<IExpenseRule>> registery = new HashMap<>();

        registery.put(ExpenseType.AIRFARE, List.of(new DisAllowRule()));

        registery.put(ExpenseType.RESTAURANT, List.of(
                new DisAllowRule(),
                new MaxAmountRule(75)));
    }

    public static List<IExpenseRule> getRuleRegisteryCommonForAllExpenses() {
        List<IExpenseRule> commonRules = List.of(
                new MaxAmountRule(2000));

        return commonRules;
    }
}

/*
 * This is generally config like we write in yaml/json/db
 * 
 * eg: json
 * 
 * "IndividualExpenseRules": {
 * "AIRFARE": [
 * {"type": "DisAllowRule"}
 * ],
 * "RESTAURANT": [
 * {"type": "DisAllowRule"},
 * {"type": "MaxAmountRule", "maxAmount": 75}
 * ]
 * },
 * "CommonExpenseRules": [
 * {"type": "MaxAmountRule", "maxAmount": 2000}
 * ]
 * 
 * 
 */
