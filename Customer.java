public class Customer {
    String fullName;
    int age;
    int id;
    String username;
    String password;
    String email;

    public Customer(int age, String email, int id, String fullName, String password, String username) {
        this.age = age;
        this.email = email;
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.username = username.toLowerCase();
    }
}
