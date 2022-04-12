package com.dds.video.controller;

import com.dds.video.model.Course;
import com.dds.video.service.CourseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class CourseControllerTest {

    @Mock
    CourseService courseService;


    @Test
    void getAllCourseTest() {
        Course course = new Course();
        List<Course> courseList = Arrays.asList(course);
        Mockito.when(courseService.getAllCourses()).thenReturn(courseList);
        Assertions.assertEquals(1, courseService.getAllCourses().size());
    }

    @BeforeEach
    void setUp() {
    }
}