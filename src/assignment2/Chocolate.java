package assignment2;

/**
 *
 * @author Milos
 */
public class Chocolate extends Product {

    int Weight;

    @Override
    double countPrice() {
        return this.basePrice + this.basePrice * tax;
    }

    /**
     * Class chocolate, returns chocolate name, barcode number, price with tax
     * and weight.
     *
     * @param name
     * @param barcode
     * @param basePrice
     * @param Weight
     */
    public Chocolate(String name, String barcode, double basePrice, int Weight) {
        this.name = name;
        this.barcode = barcode;
        this.basePrice = basePrice;
        this.Weight = Weight;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Chocolate: ");
        output.append(this.name + ", ");
        output.append("barcode: " + this.barcode + ", ");
        output.append("price: " + countPrice() + ", ");
        output.append("weight: " + Weight + " grams.");
        return output.toString();
    }
}
