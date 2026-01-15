public class EspressoCreatorFactory : IIngredientsCreatorFactory
{
    string milkType;
    string sugarType;
    EspressoCreatorFactory(string milkType, string sugarType)
    {
        this.milkType = milkType;
        this.sugarType = sugarType;
    }

    public string GetMilkType()
    {
        return this.milkType;
    }

    public string GetSugarType()
    {
        return this.sugarType;
    }
}