package user;

public class ManagerStaff extends Staff implements IStaff {
    private int staffId;
    private int age;
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private String address;
    public ManagerStaff(String fullName, int age, int id, String userName, String password, String email,
            String position, double salary, boolean isActive, int id2, int age2, String fullName2, String userName2,
            String email2, String password2, String address) {
        super(fullName, age, id, userName, password, email, position, salary, isActive);
        id = id2;
        age = age2;
        fullName = fullName2;
        userName = userName2;
        email = email2;
        password = password2;
        this.address = address;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
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
    public void setAddress(String address) {
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
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
    public String getPassword() {
        return password;
    }
    public String getAddress() {
        return address;
    }
    public String geStaffId(){
        return staffId;
    }
    public String getUsername(){}
    public boolean isActive(){}
    public boolean checkPassword(){}
    public String getFullName(){}
    

}
