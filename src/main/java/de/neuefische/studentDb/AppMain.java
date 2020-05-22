package de.neuefische.studentDb;

import de.neuefische.studentDb.model.BiologyStudent;
import de.neuefische.studentDb.model.ChemistryStudent;
import de.neuefische.studentDb.model.Student;
import de.neuefische.studentDb.db.StudentDb;

import java.util.ArrayList;
import java.util.Optional;

public class AppMain {

    public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            Optional<Student> optionalStudent;

            students.add(new BiologyStudent("Birgit",1));
            students.add(new BiologyStudent("achsel",2));
            students.add(new ChemistryStudent("Dominik", 3));

            StudentDb studentDb = new StudentDb(students);
            System.out.println(studentDb.toString());

            studentDb.addStudent(new ChemistryStudent("Greta",4));
            System.out.println(studentDb.toString());

            studentDb.removeStudentByIndex(1);
            System.out.println(studentDb.toString());

            studentDb.removeStudentByObject(new BiologyStudent("Birgit" , 1));
            System.out.println(studentDb.toString());

            optionalStudent = studentDb.findStudentByName("Greta");
            if(optionalStudent.isPresent()){
                    System.out.println(optionalStudent.get().toString());
            }else{
                    System.out.println("Student not found #404");
            }





    }
}
