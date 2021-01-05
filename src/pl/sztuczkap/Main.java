package pl.sztuczkap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(
                "Wojtek",
                23874L,
                List.of("Inżynieria oprogramowania", "Programownaie obiektowe", "Matematyka dyskretna")
        ));
        studentList.add(new Student(
                "Anna",
                63883L,
                List.of("Psychologia społeczna", "Terapia dzieci", "Antropologia")
        ));
        studentList.add(new Student(
                "Ola",
                736363L,
                List.of("Automatyka", "Matematyka dyskretna", "Mechanika")
        ));

//        studentList.stream().map(Student::getName).forEach(System.out::println);

        studentList
                .stream()
                .flatMap(student -> student.getLectures().stream()).forEach(System.out::println);
        // flat map spłaszcza strukture obiektów
    }
}
