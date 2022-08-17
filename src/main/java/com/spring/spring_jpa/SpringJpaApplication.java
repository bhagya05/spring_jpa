package com.spring.spring_jpa;

import com.spring.spring_jpa.basic.Student;
import com.spring.spring_jpa.basic.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class SpringJpaApplication {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);
		StudentService studentService = context.getBean(StudentService.class);
		 Student student=studentService.addStudent("Bhagya",243,"Pune");
		System.out.println(student);

	}

}
