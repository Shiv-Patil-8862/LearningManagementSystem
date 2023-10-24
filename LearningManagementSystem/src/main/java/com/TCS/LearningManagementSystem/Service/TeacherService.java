package com.TCS.LearningManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TCS.LearningManagementSystem.Repository.TeacherRepositorty;
import com.TCS.LearningManagementSystem.entity.Teacher;

@Service
public class TeacherService {
	
	@Autowired
	TeacherRepositorty teacherRepository;
	
	public Teacher createTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}
    
	public Teacher findTeacherId(Long id) {
		return teacherRepository.findById(id).get();
	}
	
	public List<Teacher> findAllTeachers(){
		return (List<Teacher>) teacherRepository.findAll();
	}
	
	public void deleteteacher(Long id) {
		teacherRepository.deleteById(id);
	}
	
	public Teacher updateTeacher(Teacher t,Long id) {
		Teacher teacher=teacherRepository.findById(id).get();
		if(t.getName()!=null) {
			teacher.setName(t.getName());
		}
		if(t.getAddress()!=null) {
			teacher.setAddress(t.getAddress());
		}
		if(t.getContact()!=null) {
			teacher.setContact(t.getContact());
		}
		return teacherRepository.save(teacher);
	}
}
