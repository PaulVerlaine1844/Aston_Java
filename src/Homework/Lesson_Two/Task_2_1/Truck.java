package Homework.Lesson_Two.Task_2_1;

public class Truck extends Car {

    private String model;
    private double maxLoad;
    private double trunkCapacity;

    Truck(String model, double maxLoad, double trunkCapacity) {
        this.model = model;
        this.maxLoad = maxLoad;
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public int getNumberOfDoors() {
        return 2;
    }

    @Override
    public double getTrunkCapacity() {
        return this.trunkCapacity;
    }

    @Override
    public String getFuelType() {
        return "Diesel fuel";
    }

    @Override
    public void start() {
        System.out.println(this.model + " has started!");
    }

    @Override
    public void stop() {
        System.out.println(this.model + " has stopped!");
    }

    public double getMaxLoadCapacity() {
        return this.maxLoad;
    }
}
