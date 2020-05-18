package de.neuefische.studentDb;

import de.neuefische.studentDb.model.Student;
import de.neuefische.studentDb.model.StudentDb;

public class AppMain {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "Paul");
        students[1] = new Student(2, "Erhartdt");
        students[2] = new Student(3, "Susanne");

        StudentDb studentDb = new StudentDb(students);


        /* USE OF list() */
        for (Student student : studentDb.list()) {
            System.out.println(student.toString());
        }

        /* USE OF StudentDb.toString */
        System.out.println(studentDb.toString());

        /* USE OF addStudent() */
        studentDb.addStudent(13, "Egon");
        System.out.println(studentDb.toString());

        /* USE OF removeStudent() */
        studentDb.removeStudent(3);
        System.out.println(studentDb.toString());

        /* USE OF randomStudent()*/
        System.out.println(studentDb.randomStudent().toString());
    }
}
