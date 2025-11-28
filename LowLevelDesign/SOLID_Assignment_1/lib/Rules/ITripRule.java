package LowLevelDesign.SOLID_Assignment_1.lib.Rules;

import java.util.Optional;

import LowLevelDesign.SOLID_Assignment_1.lib.Models.Expense;

import java.util.List;

public interface ITripRule {
    Optional<List<Violation>> check(List<Expense> expenses); // if no violation, return empty Optional
}
