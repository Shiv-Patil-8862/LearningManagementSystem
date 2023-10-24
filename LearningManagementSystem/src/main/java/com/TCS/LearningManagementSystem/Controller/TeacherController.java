package com.TCS.LearningManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.TCS.LearningManagementSystem.Service.TeacherService;
import com.TCS.LearningManagementSystem.entity.Teacher;

@RestController
public class TeacherController {

	@Autowired
	TeacherService teacherService; 
	
	@PostMapping("/teacher")
	public Teacher createTeacherInfo(@RequestBody Teacher teacher) {
		return teacherService.createTeacher(teacher);
	}
	
	@GetMapping("/findTeacher")
	public Teacher findTeacher(@RequestParam Long id) {          // @PathVariable is also used in this program
		return teacherService.findTeacherId(id);
	}
	
	@GetMapping("/findAllTeacher")
	public List<Teacher> findAllTeacher() {
		return teacherService.findAllTeachers();
	}
	
	@DeleteMapping("/deleteTeacher/{id}")
	public String deleTeteacher(@PathVariable Long id) {
		teacherService.deleteteacher(id);
		return "Teacher delete Successfully";
	}
	
	@PutMapping("updateTeacher/{id}")
	public Teacher updateteacherId(@RequestBody Teacher teacher,@PathVariable Long id) {
		return teacherService.updateTeacher(teacher,id);
	}
}

