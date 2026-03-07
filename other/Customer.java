package other;
public class Customer {
    private int id;
    private int age;
    private String fullName;
    private String username;
    private String email;
    private String password;
    private boolean isOnline = true;

    public Customer(int age, String email, int id, String fullName, String password, String username, boolean isOnline) {
        this.age = age;
        this.email = email;
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.isOnline = isOnline;
        this.username = username;
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
    public String getEmail(){
        return email;
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

    public void setPassword(){
        getEmail();
    }
    public void setEmail(String email) {
        this.email = email;
    }

  
    //methods

    public void getPassword(){}
    public void changePassword(){}
    public void checkEmail(){}
    public void changeEmail(){}
    public void paymentOption(){
        getId();
        getPassword();
    }


    public boolean isActive(){
        if(isOnline){
            return isOnline;
        }
        return false;
    }
    public void getCustomerService(){

    }
    
    


}
