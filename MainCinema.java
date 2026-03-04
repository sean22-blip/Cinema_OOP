public class MainCinema {
//create shop name
Cinema cinemaShop = new Cinema("Isean-Cinema");
//create customer
Customer Sofia = new Customer(25, "Sofia1234@gmail", 100, "Sofia", "1234", "Sofia1234");
//creeeate staff
Staff John = new Staff("John Doe", 30, 200, "JohnDoe", "5678", "JohnDoe@gmail", "Manager", 5000);
// //create order
Order order1 = new Order(300, "2024-06-01 10:00:00", Sofia, John);

}