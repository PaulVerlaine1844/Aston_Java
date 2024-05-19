package Homework.Lesson_Two.Task_2_2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> hobbies1 = new ArrayList<>(List.of(new String[]{"Футбол", "Теннис", "Шахматы"}));
        MutablePerson person1 = new MutablePerson("Philipp", 16, hobbies1);
        System.out.println(person1);
        person1.setAge(20);
        List<String> newhHobbies1 = new ArrayList<>();
        newhHobbies1.addAll(hobbies1);
        newhHobbies1.add("Стрельба");
        person1.setHobbies(newhHobbies1);
        System.out.println(person1);

        List<String> hobbies2 = new ArrayList<>();
        hobbies2.add("Физика");
        ImmutablePerson person2 = new ImmutablePerson("Pascal", 39, hobbies2);
        System.out.println(person2);
        //Любые методы, изменяющие поля класса ImmutablePerson приводят к ошибке
    }
}
