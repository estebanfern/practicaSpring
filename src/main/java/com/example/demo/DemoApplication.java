package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1L, "Esteban", "estebangfernandeza@gmail.com",
				LocalDate.of(2001, Month.DECEMBER, 24), 21));
//		list.add("World");
		return list;
	}

}
