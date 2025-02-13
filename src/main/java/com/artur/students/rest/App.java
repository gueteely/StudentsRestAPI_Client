package com.artur.students.rest;

import com.artur.students.rest.configuration.MyConfig;
import com.artur.students.rest.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Student> allStudents = communication.getAllStudents();
        System.out.println(allStudents);

        Student studentById = communication.getStudent(2);
        System.out.println(studentById);

        Student student = new Student("Alexey", "Karpov", "IT", 4, 3.3);
        student.setId(9);

        communication.saveStudent(student);

        communication.deleteStudent(9);
    }
}
