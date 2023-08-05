/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_prog2013_d210250c;

/**
 *
 * @author Mii si heng
 */
class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, int engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
    }

    // Getter and setter for engineCapacity
    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int calculateTopSpeed() {
        return engineCapacity * 50;
    }

    @Override
    public double calculateRentalCost(int numberOfDays) {
        double baseCost = super.calculateRentalCost(numberOfDays);
        if (calculateTopSpeed() >= 300) {
            baseCost += 150 * numberOfDays;
        }
        return baseCost;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEngine Capacity: " + engineCapacity + "cc";
    }
}