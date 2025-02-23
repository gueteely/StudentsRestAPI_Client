package com.artur.students.rest.entity;


public class Student {
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private int course;
    private double avgGrade;

    public Student() {
    }

    public Student(String name, String surname, String faculty, int course, double avgGrade) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.avgGrade = avgGrade;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
