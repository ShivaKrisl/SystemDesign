public class Latte : Coffee
{
    public Latte(IIngredientsCreatorFactory ingredientsCreatorFactory)
    {
        _ingredientsCreatorFactory = ingredientsCreatorFactory;
    }

    public override void Boil()
    {
        Console.WriteLine("Boiling Espresso with " + _ingredientsCreatorFactory.GetMilkType() + " milk and " + _ingredientsCreatorFactory.GetSugarType() + " sugar.");
    }

    public override void Brew()
    {
        Console.WriteLine("Brewing Espresso");
    }

    public override void Freeze()
    {
        Console.WriteLine("Freezing Espresso");
    }
}