/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_prog2013_d210250c;

/**
 *
 * @author Mii si heng
 */
public class Assignment_PROG2013_D210250C {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("C123", "Toyota", "Camry", 100, 4);
        vehicles[1] = new Car("C456", "Honda", "Civic", 80, 2);
        vehicles[2] = new Motorcycle("M789", "Kawasaki", "Ninja", 50, 250);
        vehicles[3] = new Motorcycle("M012", "Harley Davidson", "Street", 70, 500);

        int numberOfDays = 5;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("Rental Cost for " + numberOfDays + " days: RM" + vehicle.calculateRentalCost(numberOfDays));
            if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Top Speed: " + motorcycle.calculateTopSpeed() + " km/h");
            }
            System.out.println("--------------------");
        }
    }
    
}
