public class CoffeeFactory
{
    public static ICoffee GetCoffee(string coffeeType, string milkType, string sugarType)
    {
        ICoffee coffee = null;

        if (coffeeType.Equals("Cappucino", StringComparison.OrdinalIgnoreCase))
        {
            CapuccinoCreatorFactory capuccinoCreatorFactory = new CapuccinoCreatorFactory(milkType, sugarType); // No access Conditions on ingredients
            coffee = new Cappucino(capuccinoCreatorFactory);
        }
        else if (coffeeType.Equals("Latte", StringComparison.OrdinalIgnoreCase))
        {
            LatteCreatorFactory latteCreatorFactory = new LatteCreatorFactory(milkType, sugarType);
            coffee = new Latte(latteCreatorFactory);
        }
        else if (coffeeType.Equals("Espresso", StringComparison.OrdinalIgnoreCase))
        {
            EspressoCreatorFactory espressoCreatorFactory = new EspressoCreatorFactory(milkType, sugarType);
            coffee = new Espresso(espressoCreatorFactory);
        }

        return coffee;
    }
}