package de.neuefische.studentDb.model;

import java.util.Objects;

public class BiologyStudent implements Student{
    private String name="";
    private int id;

    public BiologyStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public boolean hasPassed(double grade){
        return !(grade > 1.5);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiologyStudent that = (BiologyStudent) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
