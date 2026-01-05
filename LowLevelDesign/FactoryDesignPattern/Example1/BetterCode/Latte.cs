public class Latte : ICoffee
{
    public void Boil()
    {
        Console.WriteLine("Boiling milk for Latte");
    }

    public void Brew()
    {
        Console.WriteLine("Brewing Espresso for Latte");
    }

    public void Freeze()
    {
        // Not applicable for Latte
        throw new NotImplementedException();
    }
}