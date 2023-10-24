package com.TCS.LearningManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TCS.LearningManagementSystem.Repository.CollegeRepository;
import com.TCS.LearningManagementSystem.entity.Colleges;

@Service
public class CollegeService {

	@Autowired
	CollegeRepository collegeRepository;
	
	public Colleges createColleges(Colleges colleges) {
		return collegeRepository.save(colleges);
	}
	
	public Colleges findColleges(Long id) {
		return collegeRepository.findById(id).get();
	}
	
	public List<Colleges> findAllColleges() {
		return collegeRepository.findAll();
	}
	
	public void deleteColleges(Long id) {
		collegeRepository.deleteById(id);
	}
	
	public Colleges updateColleges(Colleges colleges,Long id) {
		Colleges college=collegeRepository.findById(id).get();
		if(colleges.getCollege_Name()!=null) {
			college.setCollege_Name(colleges.getCollege_Name());
		}
		if(colleges.getDepartments()!=null) {
			college.setDepartments(colleges.getDepartments());
		}
		if(colleges.getStaff_Members()!=null) {
			college.setStaff_Members(colleges.getStaff_Members());
		}
		if(colleges.getGrade()!=null) {
			college.setGrade(colleges.getGrade());
		}
		return collegeRepository.save(college);
	}
}
