package de.neuefische.studentDb.db;

import de.neuefische.studentDb.model.BiologyStudent;
import de.neuefische.studentDb.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

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
        for (int i = 0; i < students.size(); i++) {
            
        }
    }

    public boolean removeStudentByIndex(int index){
        if(students.size()>index){
            this.students.remove(index);
            return true;
        }
        return false;
    }
    public void removeStudentByObject(Student student){
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
    public Optional<Student> findStudentByName(String name){
        for(Student student : students){
            if(student.getName().equals(name)){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

}
