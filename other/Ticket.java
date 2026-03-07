package other;

public class Ticket {
    private String name;
    private int id;
    private double price;
    private boolean isavailale;
    private int soldQty = 0;
    public Ticket(int id, String name, double price, boolean  isavailable, int soldQty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isavailale = isavailable;
    }

    public String getName() {return name;}
    public int getId() {return id;}
    public double getPrice() {return price;}


    public String addTick(String name, int qty, double price){
        return "successfully added" + name + "with a price of: " + price;
    }

    @Override
    public String toString() {
        return "Ticket [name=" + name + ", price=" + price + ", isavailale=" + isavailale + "]";
    }
    //methods
    
    
}
