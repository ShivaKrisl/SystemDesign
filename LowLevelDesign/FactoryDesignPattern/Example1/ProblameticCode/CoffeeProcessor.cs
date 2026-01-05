public class CoffeeProcessor
{
   public ICoffee PrepareCoffee(string coffeeType)
   {
       ICoffee coffee = null;

       if (coffeeType.Equals("Cappucino", StringComparison.OrdinalIgnoreCase))
       {
           coffee = new Cappucino();
       }
       else if (coffeeType.Equals("Latte", StringComparison.OrdinalIgnoreCase))
       {
           coffee = new Latte();
       }
       else if (coffeeType.Equals("Espresso", StringComparison.OrdinalIgnoreCase))
       {
           coffee = new Espresso();
       }

       return coffee;
   }
}