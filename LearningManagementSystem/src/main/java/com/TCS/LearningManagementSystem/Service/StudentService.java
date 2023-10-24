package com.TCS.LearningManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TCS.LearningManagementSystem.Repository.StudentRepository;
import com.TCS.LearningManagementSystem.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	// Create Student
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	// Find Only one Student
	
	public Student getStudentId(Long id) {
		return studentRepository.findById(id).get();
	}

	// Find All Students
	
	public List<Student> allStudents() {
		return studentRepository.findAll();
	}
	
	// Delete only one Student
	
	public void deleteStudent(Long id) {
	  studentRepository.deleteById(id);
	}
	
	// Update Only one Student
	
	
	public Student updateStudentInfo(Student s,Long id) {
		Student student=studentRepository.findById(id).get();
		if(s.getName()!=null) {
			student.setName(s.getName());
		}
		if(s.getAddress()!=null) {
			student.setAddress(s.getAddress());
		}
		if(s.getContact()!=null) {
			student.setContact(s.getContact());
		}
		if(s.getCourse()!=null) {
			student.setCourse(s.getCourse());
		}
		return studentRepository.save(student);
	}
	
	// Update All Students
	
	public List<Student> updateAllStudents(Student s) {
	    List<Student> students = studentRepository.findAll();

	    for (Student student : students) {
	        if (s.getName() != null) {
	            student.setName(s.getName());
	        }
	        if (s.getAddress() != null) {
	            student.setAddress(s.getAddress());
	        }
	        if (s.getContact() != null) {
	            student.setContact(s.getContact());
	        }
	        if (s.getCourse() != null) {
	            student.setCourse(s.getCourse());
	        }
	    }

	    return studentRepository.saveAll(students);
	}
	
}
