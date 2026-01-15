public abstract class Coffee
{
    IIngredientsCreatorFactory _ingredientsCreatorFactory;
    abstract void Boil();

    abstract void Brew();

    abstract void Freeze();
}