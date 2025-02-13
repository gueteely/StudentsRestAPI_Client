package com.artur.students.rest;

import com.artur.students.rest.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {
    private final String url = "http://localhost:8080/students_rest/api/students";
    @Autowired
    private RestTemplate restTemplate;
    public List<Student> getAllStudents() {
        ResponseEntity<List<Student>> response = restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Student>>() {});
        List<Student> allStudents = response.getBody();
        return allStudents;
    }

    public Student getStudent(int id) {
        Student student = restTemplate.getForObject(url + "/" + id, Student.class);
        return student;

    }

    public void saveStudent(Student student) {
        int id = student.getId();
        if (id == 0) {
            ResponseEntity<String> response = restTemplate.postForEntity(url, student, String.class);
            System.out.println("Student saved: ");
            System.out.println(response.getBody());
        } else {
            restTemplate.put(url, student);
            System.out.println("Student with id " + id + " was updated");
        }
    }

    public void deleteStudent(int id) {
        restTemplate.delete(url + "/" + id);
        System.out.println("Student with id " + id + " was deleted");
    }
}
