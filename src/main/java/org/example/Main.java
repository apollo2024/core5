package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List students = new ArrayList();
        students.add(new Student("Иван", Arrays.asList(5.0, 5.0, 4.0), "Информатика"));
        students.add(new Student("Василий", Arrays.asList(5.0, 5.0, 5.0), "Информатика"));
        students.add(new Student("Василий", Arrays.asList(4.0, 4.0, 3.0), "Физика"));
        students = students.stream()
                .filter(student -> "Информатика"
                        .equals(student.getSpecialty))
                .sorted((student1, student2) -> Double.compare(student2.getAverageGrade(), student1.getAverageGrade()))
                .limit(5).collect(Collectors.toList());
        for (Student student : students) {
            System.out.println(student.getName() + "-" + student.getAverageGrade());
        }
    }
}
