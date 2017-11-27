public class Car {

    //instance variables
    private String color;
    private String make;
    private int horsePower;
    private double engineSize;

            //my car object
    public Car() {
        color = "white";
        horsePower = 600;
        engineSize = 2.0;
        make = "Acura";
    }  //parameters
    public Car(String color, int horsePower, double engineSize, String make){
        this.color = color;
        this.make  = make;
        this.engineSize = engineSize;
        this.horsePower = horsePower;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower (int horsePower) {
        this.horsePower = horsePower;
    }
    public double getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "Color: " + color + " Make: " + make + " HorsePower: " + horsePower + " Engine Size: "+ engineSize;
    }
}
