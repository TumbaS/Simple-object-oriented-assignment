package assignment2;

/**
 *
 * @author Milos
 */
public class Wine extends Product {

    int Volume;
    final double wineTax = 0.1;

    @Override
    double countPrice() {
        return (this.basePrice + this.basePrice * tax) + (this.basePrice + this.basePrice * tax) * wineTax;
    }

    /**
     * Class wine, returns wine name, barcode number, price with tax and volume.
     *
     * @param name
     * @param barcode
     * @param basePrice
     * @param Volume
     */
    public Wine(String name, String barcode, double basePrice, int Volume) {
        this.name = name;
        this.barcode = barcode;
        this.basePrice = basePrice;
        this.Volume = Volume;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Wine: ");
        output.append(this.name + ", ");
        output.append("barcode: " + this.barcode + ", ");
        output.append("price: " + countPrice() + ", ");
        output.append("volume: " + Volume + " milliliters.");
        return output.toString();
    }
}
