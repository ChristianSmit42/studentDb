package de.neuefische.studentDb;

import de.neuefische.studentDb.model.BiologyStudent;
import de.neuefische.studentDb.model.ChemistryStudent;
import de.neuefische.studentDb.model.Student;
import de.neuefische.studentDb.db.StudentDb;

public class AppMain {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new BiologyStudent("Paul", 1);
        students[1] = new BiologyStudent("Erhartdt", 2);
        students[2] = new ChemistryStudent("Susanne", 3);

        StudentDb studentDb = new StudentDb(students);

        //* USE OF randomStudent()*//*
        System.out.println("random Student: " +
                studentDb.randomStudent().toString() +
                "\n");

        for(Student student: studentDb.list()){
            System.out.printf("%s has passed: %s%n", student.toString(), student.hasPassed(1.55));
        }

    }
}
