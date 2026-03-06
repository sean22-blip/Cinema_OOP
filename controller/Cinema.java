package controller;

import java.util.ArrayList;
import other.Customer;
import other.Ticket;
import user.Staff;

public class Cinema {
    private String name;
    private ArrayList<Staff> staffs;
    private ArrayList<Customer> Customers;
    private ArrayList<Ticket> tickets;

    public Cinema( String name) {
                this.name = name;
    }

    public String getName() {
        return name;
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

    
}