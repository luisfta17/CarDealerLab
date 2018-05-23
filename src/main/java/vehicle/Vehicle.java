package vehicle;

import java.util.ArrayList;

public abstract class Vehicle {
    private int price;
    private String colour;
    private VehicleComponent engine;
    private ArrayList<VehicleComponent> tyres;

    public Vehicle(int price, String colour, VehicleComponent engine){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = new ArrayList<>();
    }

    public int getPrice(){
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public VehicleComponent getEngine() {
        return engine;
    }
    public ArrayList<VehicleComponent> getTyres() {
        return this.tyres;
    }
    public void addTyre(Tyre tyre){
        this.tyres.add(tyre);
    }
}
