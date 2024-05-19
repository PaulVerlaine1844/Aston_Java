package Homework.Lesson_Two.Task_2_1;

public class Sedan extends Car {

    private String model;
    private String segment;
    private String fuel;
    private double trunkCapacity;

    Sedan(String model, String segment, String fuel, double trunkCapacity) {
        this.model = model;
        this.segment = segment;
        this.fuel = fuel;
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public int getNumberOfDoors() {
        return 4;
    }

    @Override
    public double getTrunkCapacity() {
        return this.trunkCapacity;
    }

    @Override
    public String getFuelType() {
        return this.fuel;
    }
    @Override
    public void start() {
        System.out.println(this.model + " has started!");
    }
    @Override
    public void stop() {
        System.out.println(this.model + " has stopped!");
    }

    public String getLuxuryLevel() {
        return String.format("Автомобиль марки %s имеет класс комфорта: %s", this.model, this.segment);
    }
}
