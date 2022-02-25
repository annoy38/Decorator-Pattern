
package MadeTruck;

public class MainClass {

    public static void main(String[] args) {
        
        ITruckClass scania = new ScaniaTruck();
        System.out.println("This is Scania truck without box");
        scania.truckBody();
        TruckBoxClass box = new TruckBoxClass(new ScaniaTruck());
        System.out.println("Add Box with Scania truck");
        box.truckBody();
        TruckColourClass colour = new TruckColourClass(new ScaniaTruck());
        System.out.println("Add colour with Scania truck");
        colour.truckBody();
        // ITruckClass daf = new DAFTruck();
       /* System.out.println("\nNOW WE MADE ANOTHER TRUCK");
        daf.truckBody();
        System.out.println("Now we add Box with this Truck");
        TruckBoxClass daf_box = new TruckBoxClass(new DAFTruck());
        daf_box.truckBody();
        System.out.println("Now add another functionalities, that is colour");
        TruckColourClass daf_colour = new TruckColourClass(new DAFTruck());
        daf_colour.truckBody();*/
   
    }
    
}
