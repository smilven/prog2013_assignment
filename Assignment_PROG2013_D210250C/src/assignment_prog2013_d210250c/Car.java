/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_prog2013_d210250c;

/**
 *
 * @author Mii si heng
 */
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, int numberOfDoors) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and setter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int numberOfDays) {
        double baseCost = super.calculateRentalCost(numberOfDays);
        if (numberOfDoors > 2) {
            baseCost += 35 * numberOfDays;
        }
        return baseCost;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Doors: " + numberOfDoors;
    }
}

