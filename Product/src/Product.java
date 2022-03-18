// Jonathan Ocampo
//03/11/22
//Creating a Product class for all the attributes to be stored and used when called upon
abstract class Product {
    // Protected Class Attributes - available to all subclasses under this class
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    abstract void getDetails();

    // Checking whether you are buying a product or not.
    boolean buy() {
        if (this.quantity > 0) {
            this.quantity--;
            return true;
        } else {
            return false;
        }
    }
}