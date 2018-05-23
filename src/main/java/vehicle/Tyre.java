package vehicle;

public class Tyre extends VehicleComponent{
    private int size;

    public Tyre(String make, String model, int size){
        super(make, model);
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}
