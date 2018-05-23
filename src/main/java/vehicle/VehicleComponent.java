package vehicle;

public abstract class VehicleComponent {
    private String make;
    private String model;

    public VehicleComponent(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }
}

