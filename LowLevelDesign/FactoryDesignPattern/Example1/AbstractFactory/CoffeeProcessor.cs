public class CoffeeProcessor
{
   public ICoffee PrepareCoffee(string coffeeType, string milkType, string sugarType)
   {
         ICoffee coffee = new CoffeeFactory().GetCoffee(coffeeType, milkType, sugarType);
         return coffee;
   }
}