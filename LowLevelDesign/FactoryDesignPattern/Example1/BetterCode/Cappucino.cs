public class Cappucino : ICoffee
{
    public void Boil()
    {
        Console.WriteLine("Boiling milk for Cappucino");
    }

    public void Brew()
    {
        Console.WriteLine("Brewing Espresso for Cappucino");
    }

    public void Freeze()
    {
        // Not applicable for Cappucino
        throw new NotImplementedException();
    }
}