package dealership;
import vehicle.Vehicle;
import java.util.ArrayList;

public class DealerShip {
    private ArrayList<Vehicle> garage;
    private int till;

    public DealerShip(int till){
        this.till = till;
        this.garage = new ArrayList<>();
    }

    public int getTill() {
        return this.till;
    }

    public ArrayList<Vehicle> getGarage() {
        return this.garage;
    }

    public void addCar(Vehicle vehicle) {
        this.garage.add(vehicle);
    }

    public void removeCar(Vehicle vehicle) {
        this.garage.remove(vehicle);
    }

    public void addMoney(int money) {
        this.till += money;
    }
    public void removeMoney(int money) {
        this.till -= money;
    }

    public void sellCar(Vehicle vehicle, Customer customer) {
        if (customer.getWallet() >= vehicle.getPrice()){
            customer.addCar(vehicle);
            customer.removeMoney(vehicle.getPrice());
            this.addMoney(vehicle.getPrice());
            this.removeCar(vehicle);
        }
    }
}
