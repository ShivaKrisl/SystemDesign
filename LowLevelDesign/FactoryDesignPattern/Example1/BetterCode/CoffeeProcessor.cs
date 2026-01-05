public class CoffeeProcessor
{
   public ICoffee PrepareCoffee(string coffeeType)
   {
         ICoffee coffee = new CoffeeFactory().GetCoffee(coffeeType);
         return coffee;
   }
}