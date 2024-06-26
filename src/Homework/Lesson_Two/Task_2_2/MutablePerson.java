package Homework.Lesson_Two.Task_2_2;

import java.util.List;

public class MutablePerson {
    private String name;
    private int age;
    private List<String> hobbies;

    public MutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s %nВозраст:%s %nИнтересы: %s%n", this.name, this.age, this.hobbies.toString());
    }
}
