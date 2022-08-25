package com.spring.spring_jpa;

import com.spring.spring_jpa.dto.CustomerRequestDTO;
import com.spring.spring_jpa.dto.CustomerResponseDTO;
import com.spring.spring_jpa.entity.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
@AutoConfiguration
public class SpringJpaApplication {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);


    }


}
