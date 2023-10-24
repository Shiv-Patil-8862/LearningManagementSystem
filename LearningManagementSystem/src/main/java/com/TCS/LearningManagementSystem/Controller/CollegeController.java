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

import com.TCS.LearningManagementSystem.Service.CollegeService;
import com.TCS.LearningManagementSystem.entity.Colleges;
import com.TCS.LearningManagementSystem.entity.Student;

@RestController
public class CollegeController {
   
	@Autowired
	CollegeService collegeService;
	
	@PostMapping("/saveCollege")
	public Colleges createCollege(@RequestBody Colleges colleges) {
		return collegeService.createColleges(colleges);
	}
	
	@GetMapping("/findCollege/{id}")
	public Colleges findCollege(@PathVariable Long id) {
		return collegeService.findColleges(id);
	}
	
	@GetMapping("findAllCollege")
	public List<Colleges> findAllCollege(){
		return collegeService.findAllColleges();
	}
	
	@DeleteMapping("/deleteCollege/{id}")
	public String deleteCollege(@PathVariable Long id) {
		collegeService.deleteColleges(id);
		return "College Delete Successfully";
	}
	
	@PutMapping("/updateCollege/{id}")
	public Colleges updateCollege(@RequestBody Colleges colleges,@PathVariable Long id) {
		return collegeService.updateColleges(colleges, id);
	}
}
