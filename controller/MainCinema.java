package controller;

import other.Customer;
import other.Ticket;
import user.Cashier;
import user.Staff;

public class MainCinema {

    public static void main(String[] args) {
        Cinema cinemaShop = new Cinema("Seanima", "\nStreet: 742 Evergreen Terrace\nCity: Springfield\nState: Illinois \nZIP Code: 62704\nCountry: United States");
        System.out.println(cinemaShop.getCinemaName());
        System.out.println(cinemaShop.getAddress());

        cinemaShop.createMenuItem(new Ticket(2, "Avatar_Movie", 5, true, 300));

        cinemaShop.createStaff(new Cashier("Isean", 20, 100, "SeanSean", "1234", "fake123@gmail.com", "cashier", 300, true));

        cinemaShop.createCustomer(new Customer("Ny", 67, 200, "NieNie", "6766767", "nieFake3223@gmail.com", true));


        // Staff[] allStaff = {new ManagerStaff(null, 0, 0, null, null, null, null, 0, false)}
        // for (Staff s : allStaff) {
        //     System.out.println(s.getUsername() + " can CREATE_ORDER? " + s.can(Cinema.CREATE_ORDER));
        // }
    }
}
