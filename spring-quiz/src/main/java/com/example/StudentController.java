package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping(value = "/student1")
	public StudentDto test() {
		StudentDto stDto = new StudentDto();
		stDto.setName("yuna");
		stDto.setAge(20);
		stDto.setJavaGrade("A+");
		stDto.setOracleGrade("C");
		
		return stDto;
	}
	
	@GetMapping(value = "/student2")
	public StudentDto test2() {
		StudentDto stDto = new StudentDto();
		stDto.setName("jimin");
		stDto.setAge(21);
		stDto.setJavaGrade("B+");
		stDto.setOracleGrade("F");
		
		return stDto;
	}
}
