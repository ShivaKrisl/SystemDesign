public class Capuccino : Coffee
{
    public Capuccino(IIngredientsCreatorFactory ingredientsCreatorFactory)
    {
        _ingredientsCreatorFactory = ingredientsCreatorFactory;
    }

    public override void Boil()
    {
        Console.WriteLine("Boiling Capuccino with " + _ingredientsCreatorFactory.GetMilkType() + " milk and " + _ingredientsCreatorFactory.GetSugarType() + " sugar.");
    }

    public override void Brew()
    {
        Console.WriteLine("Brewing Capuccino");
    }

    public override void Freeze()
    {
        Console.WriteLine("Freezing Capuccino");
    }
}