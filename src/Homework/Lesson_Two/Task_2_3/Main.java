package Homework.Lesson_Two.Task_2_3;

public class Main {
    public static void main(String[] args) {
        Computer.Processor processor = new Computer.Processor("Intel Core i7");
        System.out.println("Модель процессора: " + processor.getDetails());
        Computer computer = new Computer();
        Computer.Ram ram = computer.new Ram(16);
        System.out.println("Размер памяти, Гб: " + ram.getDetails());
    }
}
