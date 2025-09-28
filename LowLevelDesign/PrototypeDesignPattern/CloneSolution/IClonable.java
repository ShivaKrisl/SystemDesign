package LowLevelDesign.PrototypeDesignPattern.CloneSolution;

// By default, java has Cloneable interface, this is just for demonstration purpose
public interface IClonable<T> {
    T clone();
}
