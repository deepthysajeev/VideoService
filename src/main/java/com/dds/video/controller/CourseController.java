package com.dds.video.controller;


import com.dds.video.model.Course;
import com.dds.video.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/course", method = RequestMethod.GET)
    public List<Course> getAllCourse() {
        return courseService.getAllCourses();
    }
}

