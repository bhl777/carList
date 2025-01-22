package web.model;

public class Car {

    private String model;
    private int maxSpeed;
    private String color;

    public Car(String model, int maxSpeed, String color) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
