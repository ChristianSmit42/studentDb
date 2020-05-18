package de.neuefische.studentDb.model;

import java.util.Arrays;

public class StudentDb {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDb studentDb = (StudentDb) o;
        return Arrays.equals(students, studentDb.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }

    private Student[] students;

    public StudentDb(Student[] students) {
        this.students = students;
    }

    public Student[] list(){
        return students;
    }

    public Student randomStudent(){
        int random = (int) ((Math.random()*students.length)-1);
        return students[random];
    }

    public void removeStudent(int index){
        Student[] tempstuds = new Student[this.students.length-1];
        for(int i=0,k=0;i<this.students.length;i++){
            if(i==index){
                continue;
            }
            tempstuds[k++]=this.students[i];
        }
        this.students = tempstuds;
    }

    public void addStudent(int id, String name){
        Student[] tempstuds = new Student[this.students.length+1];

       /* for(int i=0;i<this.students.length;i++){
            tempstuds[i]=this.students[i];
        } */
        System.arraycopy(this.students, 0, tempstuds, 0, this.students.length);

        tempstuds[this.students.length] = new Student(id,name);
        this.students = tempstuds;
    }

    @Override
    public String toString() {
        StringBuilder allStudents= new StringBuilder();
        for(Student student:students){
           /*
            allStudents+=student.toString() + "\n";
           */
            allStudents.append(student.toString()).append("\n");

        }
       /* for(int i=0;i<students.length;i++){
            allStudents+=students[i].toString();
        }*/
        return allStudents.toString();
    }

}
