package t08_classes;

// Topic 1: classes and objects.
// Live: create MenuItem.java in this folder, then create objects here.
public class Main {
    public static void main(String[] args) {
        MenuItem dosa = new MenuItem();
        dosa.name = "Masala Dosa";
        dosa.price = 120;
        dosa.isVeg = true;

        MenuItem paneer = new MenuItem();
        paneer.name = "Paneer Tikka";
        paneer.price = 250;    

         System.out.println(dosa.name + " costs " + dosa.price);
         System.out.println(paneer.name + " costs " + paneer.price);
    }
}
