package assignment2;

/**
 *
 * @author Milos
 */

public abstract class Product {

    String name;
    String barcode;
    double basePrice;
    final double tax = 0.2;

    abstract double countPrice();
}
