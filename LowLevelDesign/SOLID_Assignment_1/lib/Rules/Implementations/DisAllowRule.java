package LowLevelDesign.SOLID_Assignment_1.lib.Rules.Implementations;

import java.util.Optional;

import LowLevelDesign.SOLID_Assignment_1.lib.Rules.IExpenseRule;
import LowLevelDesign.SOLID_Assignment_1.lib.Rules.Violation;
import LowLevelDesign.SOLID_Assignment_1.lib.Models.Expense;

public class DisAllowRule implements IExpenseRule {

    @Override
    public Optional<Violation> check(Expense expense) {
        return Optional.of(Violation.of("Exense type " + expense.getExpenseType() + " is not allowed."));
    }
}
