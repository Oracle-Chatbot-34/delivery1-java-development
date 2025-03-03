package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.student", "com.example.student.controller", "com.example.student.service"})
@EntityScan("com.example.student.model")
@EnableJpaRepositories("com.example.student.repository")
public class StudentMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentMicroserviceApplication.class, args);
    }

}
