public class Order {
    int orderId;
    String timeOfPurchase;

    Customer customer;
    Staff staff;
    public Order(int orderId, String timeOfPurchase, Customer customer, Staff staff) {
        this.orderId = orderId;
        this.timeOfPurchase = timeOfPurchase;
        this.customer = customer;
        this.staff = staff;
    }






    public String printReciept(){
        
        return "Working";
    }

}
