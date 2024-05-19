package Homework.Lesson_Two.Task_2_1;

public class Main {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("Toyota Camry", "D", "AI-95 gasoline", 400);
        Truck truck1 = new Truck("Kamaz", 14, 1000);
        testingOfCars(sedan1);
        System.out.println(sedan1.getLuxuryLevel());
        System.out.println("----------------");
        testingOfCars(truck1);
        System.out.println("Максимаьная грузоподъемность,т: " + truck1.getMaxLoadCapacity());
    }

    public static void testingOfCars(Car vehicle) {
        vehicle.start();
        System.out.println("Число дверей: " + vehicle.getNumberOfDoors());
        System.out.println("Тип топлива: " + vehicle.getFuelType());
        System.out.println("Объем багажа, л: " + vehicle.getTrunkCapacity());
        vehicle.stop();
    }
}
