package assignment2;

/**
 *
 * @author Milos
 */
public class Assignment2 {

    /**
     * Main class
     *
     * @param args
     */
    public static void main(String[] args) {
        Wine chardonnay = new Wine("Chardonnay", "1234567890123", 100, 750);
        Chocolate kitkat = new Chocolate("Kit Kat", "3210987654321", 4, 300);
        Chocolate ferrero = new Chocolate("Ferrero Rocher", "3210987654321", 49.5, 150);
        System.out.println(chardonnay);
        System.out.println(kitkat);
        System.out.println(ferrero);
    }

}
