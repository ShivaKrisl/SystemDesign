package SystemDesign.LowLevelDesign.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                    .Age(22)
                    .Email("sky@gmail.com")
                    .FirstName("sky")
                    .LastName("Ksy")
                    .Password("test@12345")
                    .Build();
        
    }
}
