package com.TCS.LearningManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TCS.LearningManagementSystem.entity.Colleges;

public interface CollegeRepository extends JpaRepository<Colleges, Long> {

}
