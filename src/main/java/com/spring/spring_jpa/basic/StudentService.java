package com.spring.spring_jpa.basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(String name,int rollNo,String city)
    {
        if(studentRepository== null) System.out.println("StudentRepository is null");
        Student student = new Student(name,city);
        student.setRollNo(rollNo);
        return studentRepository.save(student);

    }
}
