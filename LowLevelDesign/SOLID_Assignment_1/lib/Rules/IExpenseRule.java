package LowLevelDesign.SOLID_Assignment_1.lib.Rules;

import java.util.Optional; // Optional is a container object which may or may not contain a non-null value.

import LowLevelDesign.SOLID_Assignment_1.lib.Models.Expense;

public interface IExpenseRule {
    Optional<Violation> check(Expense expense); // if no violation, return empty Optional
}
