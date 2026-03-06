package user;

public class Cashier {

    private int age;
    private int id;
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private String position;
    private double salary;
    private boolean isActive;

    public Cashier(String fullName, int age, int id, String userName, String password, String email, String position, double salary, boolean isActive) {
        this.fullName = fullName;
        this.age = age;
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.position = position;
        this.salary = salary;
        this.isActive = isActive;
    }
}
