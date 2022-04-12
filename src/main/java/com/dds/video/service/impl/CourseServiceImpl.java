package com.dds.video.service.impl;

import com.dds.video.dao.CourseDAO;
import com.dds.video.model.Course;
import com.dds.video.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDAO courseDAO;


    @Override
    public List<Course> getAllCourses() {
        return courseDAO.getAllCourses();
    }
}
