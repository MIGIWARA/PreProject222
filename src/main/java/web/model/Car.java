package web.model;

import java.util.Objects;


public class Car {

    private String model;
    private String transmission;
    private int engineOutput;

    public Car() {
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getEngineOutput() {
        return engineOutput;
    }

    public void setEngineOutput(int engineOutput) {
        this.engineOutput = engineOutput;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "model -> " + model + " transmission -> " + transmission + " engineOutput -> " + engineOutput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engineOutput == car.engineOutput && Objects.equals(model, car.model) && Objects.equals(transmission, car.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, transmission, engineOutput);
    }
}
