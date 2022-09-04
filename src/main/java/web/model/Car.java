package web.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
}
