class Main
{
    static void Main(string[] args)
    {
        CoffeeProcessor coffeeProcessor = new CoffeeProcessor();
        ICoffee cappucino = coffeeProcessor.PrepareCoffee("Cappucino", "Almond Milk", "No Sugar");
        cappucino.Boil();
    }
}