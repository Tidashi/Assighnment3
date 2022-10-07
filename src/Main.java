//This is TestClass
public class Main {
    public static void main(String[] args) {
        gas a = new gas();
        a.gas("Honda", "Civic", 2002, "L3AD84", 30, 150000, "diesel");
        System.out.println("you get " +a.getFuelEffciency(2800) + " miles per gallon");

        electric b = new electric();
        b.electric("Buick", "car", 2004, "L3AD84", 30, 150000);
        System.out.println("you get " +a.getFuelEffciency(2800) + " miles per watt");

        hybrid c = new hybrid();
        b.electric("Steel", "Truck", 2011, "L3AD84", 30, 150000);
        System.out.println("you get " +c.getFuelEffciency(2800) + " miles per watt/gallon");




    }

}