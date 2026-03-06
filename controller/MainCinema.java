package controller;
import other.Customer;
import other.Order;
import user.Staff;

public class MainCinema {
//create shop name
Cinema cinemaShop = new Cinema("Seanima");
//create customer
Customer Sofia = new Customer(25, "Sofia1234@gmail", 100, "Sofia", "1234", "Sofia1234", true);
//create staff
Staff John = new Staff("John Doe", 30,11, "JohnDoe", "5678", "JohnDoe@gmail", "staff", 500, true);
Staff Stacy = new Staff("Stacy sara", 20, 10, "cycy", "1223", "Stacyafke21@gmail.com", "staff", 500, true);

// //create order
Order order1 = new Order(300, "2024-06-01 10:00:00", Sofia, John);

}