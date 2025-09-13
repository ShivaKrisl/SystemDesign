using System.Collections.Generic;
using Models;
namespace Rules
{
    public interface ITripRule
    {
        List<Violation>? ValidateTrip(List<Expense> expenses);
    }
}