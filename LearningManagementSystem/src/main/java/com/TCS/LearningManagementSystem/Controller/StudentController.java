package com.TCS.LearningManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TCS.LearningManagementSystem.Service.StudentService;
import com.TCS.LearningManagementSystem.entity.Student;

@RestController
public class StudentController {
	
	
	@Autowired
	StudentService studentService;
	
	
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping("/find/{id}")
	public Student findsStudentId(@PathVariable Long id) {
		return studentService.getStudentId(id);
	}
	
	@GetMapping("/findAll")
	public List<Student> findAllStudents() {
		return studentService.allStudents();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTheStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return "Student delete Successfully";
	}
	
	@PutMapping("update/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable Long id) {
		return studentService.updateStudentInfo(student,id);
	}
	
	@PutMapping("/updateAll")
	public List<Student> updateAll(@RequestBody Student s){
		return studentService.updateAllStudents(s);
	}
}
