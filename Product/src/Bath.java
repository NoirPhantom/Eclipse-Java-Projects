
// Jonathan Ocampo
//03/11/22
//Creating a Bath class that uses attributes from parent class in conjunction with its own private attributes to be stored and call when needed
public class Bath extends Product {

    public Bath(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    void getDetails() {
        System.out.println("We sell organic bath products!");
    }

    @Override
    public String toString() {
        return "Bath []";
    }

}
