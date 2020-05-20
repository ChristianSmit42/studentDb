package de.neuefische.studentDb.model;

import java.util.Objects;

public interface Student {
    public int getId();
    public String getName();
    public void setId(int id);
    public void setName(String name);
    public String toString();
    public boolean hasPassed(double grade);
    public boolean equals(Object o);
    public int hashCode();
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    private String name="";
    private int id;

    public Student(int id, String name){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }*/
}
