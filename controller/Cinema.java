package controller;

import java.util.ArrayList;
import other.Customer;
import other.Ticket;
import user.Staff;

public class Cinema {

    private String cinemaName;
    private String address;

    private ArrayList<Staff> staffs;
    private ArrayList<Customer> Customers;
    private ArrayList<Ticket> tickets;

    public static final String CREATE_STAFF = "CREATE_STAFF";
    public static final String CREATE_CUSTOMER = "CREATE_CUSTOMER";
    public static final String CREATE_MENU_ITEM = "CREATE_MENU_ITEM";
    public static final String SET_MENU_AVAILABILITY = "CREATE_MENU_AVAILIBILITY";
    public static final String CREATE_ORDER = "CREATE_ORDER";
    public static final String VIEW_CUSTOMERS = "VIEW_CUSTOMERS";
    public static final String VIEW_ORDERS = "VIEW_ORDERS";
    public static final String UPDATE_ORDER_STATUS = "UPDATE_ORDER_STATUS";
// PENDING	Order is created but not processed yet
// PROCESSING	Staff is preparing the order or tickets
// COMPLETED	Order is finished and paid
// CANCELED	Order was canceled
// REFUNDED	Payment returned to customer
    //Constructo
    public Cinema(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public void setCinemaName(String name) {

    }

    public void setAddress(String address) {

    }

    public String getName() {
        return cinemaName;
    }

    public String getStaffs() {
        return "Currently working!";
    }

    public String getCustomers() {
        return "Currently working!";
    }

    public String getTickets() {
        return "Currently working!";
    }

    public void addTicket(String name, int qty, double price) {

    }

    public void displayAllTicket() {

    }

    public void createStaff() {

    }

    public void createCustomer() {

    }

    public void createMenuItem() {

    }

    public void createMenuAvailibility() {
    }

    public void createOrder() {

    }

    public void viewCustomers() {

    }

    public void viewOrders() {
    }

    public void updateOrderStatus() {
    }
}
