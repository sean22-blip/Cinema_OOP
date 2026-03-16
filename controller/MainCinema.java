package controller;

import user.Cashier;
import user.ManagerStaff;
import user.Staff;

public class MainCinema {

    public static void main(String[] args) {
        Cinema cinemaShop = new Cinema("Seanima", "\nStreet: 742 Evergreen Terrace\nCity: Springfield\nState: Illinois \nZIP Code: 62704\nCountry: United States");
        System.out.println(cinemaShop.getCinemaName());
        System.out.println(cinemaShop.getAddress());

        Staff staff = new Cashier(null, 0, 0, null, null, null, null, 0, false);
        Staff staff1 = new ManagerStaff(null, 0, 0, null, null, null, null, 0, false);
       
        // Staff[] allStaff = {new ManagerStaff(null, 0, 0, null, null, null, null, 0, false)}
        // for (Staff s : allStaff) {
        //     System.out.println(s.getUsername() + " can CREATE_ORDER? " + s.can(Cinema.CREATE_ORDER));
        // }
    }
}
