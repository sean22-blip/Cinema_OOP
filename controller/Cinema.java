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

    //Constructo
    public Cinema(String cinemaName, double price, int quantity, ArrayList<Staff> staffs, ArrayList<Customer> customers,
            ArrayList<Ticket> tickets) {

        setCinemaName(cinemaName);
        setAddress(address);

        staffs = new ArrayList<>();
        customers = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    public void setCinemaName(String name) {
        
    }
    public void setAddress(String address){

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

    //methods
    public void addTicket(String name, int qty, double price){

    }
    public void displayAllTicket() {

    }
    public void createStaff(){

    }
    public void createCustomer(){

    }
    public void createMenuItem(){

    }
    public void createMenuAvailibility(){
    }
    public void createOrder(){

    }
    public void viewCustomers(){
        
    }
    public void viewOrders(){}
    public void updateOrderStatus(){}
}
