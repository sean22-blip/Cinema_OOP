package other;
import user.Staff;

public class Order {
    private int orderId = 0;
    private String timeOfPurchase;
    private double total = 0;

    //Classes to serve as attributes for Order class
    private Customer customer;
    private Staff staff;
    public Order(int orderId, String timeOfPurchase, Customer customer, Staff staff) {
        this.orderId = orderId;
        this.timeOfPurchase = timeOfPurchase;
        this.customer = customer;
        this.staff = staff;
    }

    //Getters
    public int getOrderId(){return orderId;}
    public Customer getCustomer() {return customer;}
    public String getTimeOfPurchase() {return timeOfPurchase;}
    public Staff getStaff() {return staff;}

    //Setters
    public void setCustomer(Customer customer) {this.customer = customer; }
    public void setStaff(Staff staff) {this.staff = staff;}

    //methods
    public void createOrder(){}
    public void getTotal(){}
    public void printReciept(){}

}
