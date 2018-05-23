package vehicle;

public class Engine extends VehicleComponent{
    private int power;

    public Engine(String make, String model, int power){
        super(make, model);
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
