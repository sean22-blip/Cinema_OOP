package other;
public class Customer {
    private int id;
    private int age;
    private String fullName;
    private String username;
    private String email;
    private String password;

    public Customer(int age, String email, int id, String fullName, String password, String username) {
        this.age = age;
        this.email = email;
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.username = username.toLowerCase();
    }
    //Getters
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }
    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    


}
