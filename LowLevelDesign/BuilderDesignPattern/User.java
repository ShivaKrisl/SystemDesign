package SystemDesign.LowLevelDesign.BuilderDesignPattern;

public class User{
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String password;

    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.password = builder.password;
    } // creates user object from builder

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String password;

        // Set Age
        Builder Age(int age){
            if(age <= 0) throw new IllegalArgumentException("Inavlid argument");
            this.age = age;
            return this;
        }

        // Set Fname
        Builder FirstName(String firstName){
            if(firstName.isEmpty() || firstName.length() == 0){
                throw new IllegalArgumentException("Inavlid argument");
            }
            this.firstName = firstName;
            return this;
        }

        // Set Lname
        Builder LastName(String lastName){
            if(lastName.length() == 0 || lastName.isEmpty()){
                throw new IllegalArgumentException("Inavlid argument");
            }
            this.lastName = lastName;
            return this;
        }

        // set Email
        Builder Email(String email){
            if(email.length() == 0 || email.isEmpty() || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
                throw new IllegalArgumentException("Invalid argument");
            }
            this.email = email;
            return this;
        }

        // set Password
        Builder Password(String password){
            if(password.length()== 0 || password.isEmpty() || password.length() < 8){
                throw new IllegalArgumentException("Invalid argument");
            }
            this.password = password;
            return this;
        }

        // Build User Object
        User Build(){
            return new User(this);
        }
    }
}

