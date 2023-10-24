package com.TCS.LearningManagementSystem.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TCS.LearningManagementSystem.entity.Teacher;

@Repository
public interface TeacherRepositorty extends CrudRepository<Teacher, Long>{

}
