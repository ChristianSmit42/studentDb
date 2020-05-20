package de.neuefische.studentDb;

import de.neuefische.studentDb.model.BiologyStudent;
import de.neuefische.studentDb.model.ChemistryStudent;
import de.neuefische.studentDb.model.Student;
import de.neuefische.studentDb.db.StudentDb;

import java.util.ArrayList;

public class AppMain {

    public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();

            students.add(new BiologyStudent("Birgit",1));
            students.add(new BiologyStudent("achsel",2));
            students.add(new ChemistryStudent("Dominik", 3));

            StudentDb studentDb = new StudentDb(students);
            System.out.println(studentDb.toString());

            studentDb.addStudent(new ChemistryStudent("Greta",4));
            System.out.println(studentDb.toString());

            studentDb.removeStudent(1);
            System.out.println(studentDb.toString());

            studentDb.removeStudent(new BiologyStudent("Birgit" , 1));
            System.out.println(studentDb.toString());



    }
}
