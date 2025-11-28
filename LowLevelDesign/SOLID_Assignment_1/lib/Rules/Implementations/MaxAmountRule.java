package LowLevelDesign.SOLID_Assignment_1.lib.Rules.Implementations;

import java.util.Optional;

import LowLevelDesign.SOLID_Assignment_1.lib.Models.Expense;
import LowLevelDesign.SOLID_Assignment_1.lib.Rules.IExpenseRule;
import LowLevelDesign.SOLID_Assignment_1.lib.Rules.Violation;

public class MaxAmountRule implements IExpenseRule {

    private final double maxAmount;

    public MaxAmountRule(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Override
    public Optional<Violation> check(Expense expense) {
        if (expense.getAmount() > maxAmount) {
            return Optional.of(Violation
                    .of("Expense amount " + expense.getAmount() + " exceeds maximum allowed amount of " + maxAmount));
        } else {
            return Optional.empty();
        }
    }

}
