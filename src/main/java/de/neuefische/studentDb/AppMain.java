package de.neuefische.studentDb;

import de.neuefische.studentDb.model.BiologyStudent;
import de.neuefische.studentDb.model.ChemistryStudent;
import de.neuefische.studentDb.model.Student;
import de.neuefische.studentDb.db.StudentDb;

public class AppMain {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new BiologyStudent("Paul", 1);
        students[1] = new ChemistryStudent("Erhartdt", 2);
        students[2] = new ChemistryStudent("Susanne", 3);

        StudentDb studentDb = new StudentDb(students);


        //* USE OF list() *//*
        for (Student student : studentDb.list()) {
            System.out.println(student.toString());
        }

        //* USE OF StudentDb.toString *//*
        System.out.println(studentDb.toString());

        //* USE OF addStudent() *//*
        studentDb.addStudent(13, "Egon");
        System.out.println(studentDb.toString());

        //* USE OF removeStudent() *//*
        studentDb.removeStudent(3);
        System.out.println(studentDb.toString());

        //* USE OF randomStudent()*//*
        System.out.println(studentDb.randomStudent().toString());
        System.out.println(studentDb.list()[1].toString() +
                " has failed his classes: " +
                studentDb.list()[1].hasFailed(2.5)
        );

    }
}
