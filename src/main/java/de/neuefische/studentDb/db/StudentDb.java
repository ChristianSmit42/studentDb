package de.neuefische.studentDb.db;

import de.neuefische.studentDb.model.BiologyStudent;
import de.neuefische.studentDb.model.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDb {

    private ArrayList<Student> students;

    public StudentDb(ArrayList<Student> students) {

        this.students = students;
    }

    public ArrayList<Student> list() {
        return students;
    }

    public Student randomStudent() {
        int random = (int) (Math.random() * students.size());
        return students.get(random);
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void removeStudent(int index){
        this.students.remove(index);
    }
    public void removeStudent(Student student){
        this.students.remove(student);
    }

    public optional<Student>  addStudent(ArrayList<Student> students){
        for(Student student:students){
            if(this.student.getId()==)
        }
    }

    @Override
    public String toString() {
        StringBuilder allStudents = new StringBuilder();
        for (Student student : students) {

            allStudents.append(student.toString()).append("\n");

        }

        return allStudents.toString();
    }

}
