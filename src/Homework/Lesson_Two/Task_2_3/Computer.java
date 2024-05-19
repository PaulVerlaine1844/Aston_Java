package Homework.Lesson_Two.Task_2_3;

public class Computer {

    static class Processor {
        String model;

        Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return model;
        }
    }

    class Ram {
        int size;

        Ram(int size) {
            this.size = size;
        }

        public int getDetails() {
            return size;
        }
    }
}
