package user;

public abstract class Staff implements IStaff {//IStaff is the parents and Staff is the child

    private int age;
    private int id;
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private String position;
    private double salary;
    private boolean isActive;

    @Override
    public abstract boolean can(String action);
    public Staff(String fullName, int age, int id, String userName, String password, String email, String position, double salary, boolean isActive) {
        this.fullName = fullName;
        this.age = age;
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.position = position;
        this.salary = salary;
        this.isActive = isActive;
        System.out.println("1) Staff is created from Staff Constructor!");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
//needed to implement some function

    public String getPassword() {
        return password;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getStaffId() {
        return null;
    }

    ;

    public String getUsername() {
        return null;
    }

    ;

    public boolean isActive() {
        return false;
    }

    ;

    public boolean checkPassword(String input) {
        return false;
    }

    
 
}
