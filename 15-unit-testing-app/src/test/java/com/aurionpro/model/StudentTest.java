package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	
	Student student;
	StudentService service;
	
	@BeforeEach
	void init() {
		service = Mockito.mock(StudentService.class);
		student = new Student(service);
	}

	@Test
	void test() {
		Mockito.when(service.getTotalMarks()).thenReturn(450.00);
		Mockito.when(service.getNumberOfSubjects()).thenReturn(5.00);
		
		assertEquals(90.00, student.getAverage());
	}

}
