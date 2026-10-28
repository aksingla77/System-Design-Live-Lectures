package t09_constructors;

// Topic 2: constructors and this. Starts where topic 1 ended.
// Live: add a constructor to MenuItem and watch the lines below break.
public class Main {
    public static void main(String[] args) {
        // MenuItem dosa = new MenuItem();
        // dosa.name = "Masala Dosa";
        // dosa.price = 120;

        // MenuItem paneer = new MenuItem();
        // paneer.name = "Paneer Tikka";
        // paneer.price = 250;

        MenuItem dosa = new MenuItem("Masala Dosa", 120, true);
        MenuItem paneer = new MenuItem("Paneer Tikka", 250, true);

        System.out.println(dosa.name + " costs " + dosa.price);
        System.out.println(paneer.name + " costs " + paneer.price);
    }
}
