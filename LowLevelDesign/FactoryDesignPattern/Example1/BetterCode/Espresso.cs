public class Espresso : ICoffee
{
    public void Boil()
    {
        // Not applicable for Espresso
        throw new NotImplementedException();
    }

    public void Brew()
    {
        Console.WriteLine("Brewing Espresso");
    }

    public void Freeze()
    {
        // Not applicable for Espresso
        throw new NotImplementedException();
    }
}