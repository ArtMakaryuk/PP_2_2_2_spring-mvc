package web.model;

public class Car {

    private String model;

    private int number;

    private String colour;

    public Car() {}

    public Car(String model, int number, String colour) {
        this.model = model;
        this.number = number;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", colour='" + colour + '\'' +
                '}';
    }
}
