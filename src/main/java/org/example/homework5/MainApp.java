package org.example.homework5;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MainApp {
    public static int size = 5;

    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        Student student = Student.builder()
                .name("Arty")
                .grades(Arrays.asList(5.0, 4.0, 5.0, 3.0, 5.0, 5.0))
                .specialty("electrocity")
                .build();

        Student student1 = new Student("Ira", Arrays.asList(5.0, 5.0, 5.0, 4.0), "electrocity");
        Student student2 = new Student("Vera", Arrays.asList(4.0, 4.0, 5.0, 5.0), "electrocity");
        Student student3 = new Student("Lena", Arrays.asList(3.0, 4.0, 5.0, 3.0), "electrocity");
        Student student4 = new Student("Semen", Arrays.asList(4.0, 4.0, 4.0, 3.0), "electrocity");
        Student student5 = new Student("Igor", Arrays.asList(5.0, 4.0, 5.0, 3.0), "electrocity");
        Student student6 = new Student("Dima", Arrays.asList(5.0, 4.0, 5.0, 3.0), "electrocity");
        Student student7 = new Student("Diana", Arrays.asList(5.0, 4.0, 5.0, 3.0), "electrocity");
        Student student8 = new Student("Alex", Arrays.asList(5.0, 4.0, 5.0, 3.0), "electrocity");
        Student student9 = new Student("Borya", Arrays.asList(5.0, 4.0, 5.0, 3.0), "electrocity");
        Student student10 = new Student("Olga", Arrays.asList(5.0, 4.0, 5.0, 5.0), "electrocity");
        Student student11 = new Student("Maria", Arrays.asList(4.0, 5.0, 4.0, 5.0), "electrocity");
        Student student12 = new Student("Daria", Arrays.asList(3.0, 4.0, 5.0, 3.0), "electrocity");
        Student student13 = new Student("Max", Arrays.asList(3.0, 4.0, 4.0, 5.0), "electrocity");
        Student student14 = new Student("Tom", Arrays.asList(5.0, 4.0, 5.0, 5.0), "electrocity");
        Student student15 = new Student("Riley", Arrays.asList(5.0, 4.0, 5.0, 3.0), "electrocity");

        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);

        List<Student> firstGroup = students.stream()
                .filter(s -> s.getAverageGrade() >= 4.5)
                .limit(5)
                .collect(Collectors.toList());


        System.out.println(firstGroup);

//        ListNames listNames = new ListNames();
//        String file1 = "src/main/resources/female-names.txt";
//        String file2 = "src/main/resources/male-names.txt";
//        listNames.setFileMaleName(file2);
//        listNames.setFileFemaleName(file1);
//        listNames.getListOfNames(10);

    }
}