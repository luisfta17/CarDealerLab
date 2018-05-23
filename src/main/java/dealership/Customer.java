package dealership;

import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {
    private int wallet;
    private ArrayList<Vehicle> ownedCars;

    public Customer(int wallet){
        this.wallet = wallet;
        this.ownedCars = new ArrayList<>();
    }

    public int getWallet() {
        return this.wallet;
    }

    public ArrayList<Vehicle> getOwnedCars() {
        return this.ownedCars;
    }

    public void removeMoney(int money) {
        this.wallet -= money;
    }

    public void addMoney(int money) {
        this.wallet += money;
    }

    public void addCar(Vehicle vehicle){
        this.ownedCars.add(vehicle);
    }
}
