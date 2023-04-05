package days.Replit;

public class Invoice {
    public static void main(String[] args) {

    }
    private String number;
    private String description;
    private int quantity;
    private double price;

    Invoice(String number, String description, int quantity, double price){
        this.number=number;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
        if(quantity<0){
            this.quantity=0;
        }
        if(price<0){
            this.price=0;
        }

    }
    public static double getInvoice(int quantity, double price){
        return quantity*price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
