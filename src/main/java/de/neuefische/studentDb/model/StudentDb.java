package de.neuefische.studentDb.model;

public class StudentDb {
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

    @Override
    public String toString() {
        String allStudents="";
        for(Student student:students){
            allStudents+=student.toString() + "\n";
        }
       /* for(int i=0;i<students.length;i++){
            allStudents+=students[i].toString();
        }*/
        return allStudents;
    }

}
