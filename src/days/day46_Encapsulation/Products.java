package days.day46_Encapsulation;

public class Products {
    private String brand;
    private String productName;
    int amount;
    private int barcode;
    double price;

    Products(String brand, String productName, int amount, int barcode, double price) {
        this.brand = brand;
        this.productName = productName;
        this.amount = amount;
        this.barcode = barcode;
        this.price = price;
    }

    public int getBarcode() {
        return barcode;
    }

    public String getProductName() {

        return productName;
    }

    public String getBrand() {

        return brand;
    }

    public static void main(String[] args) {
        Products product1=new Products("Ulker","KitKat",100,86812345,5.5);
        System.out.println("product1.getBarcode() = " + product1.getBarcode());

    }

}
