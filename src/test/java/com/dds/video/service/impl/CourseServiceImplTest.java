package com.dds.video.service.impl;

import com.dds.video.dao.CourseDAO;
import com.dds.video.model.Course;
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
class CourseServiceImplTest {

    @Mock
    private CourseDAO courseDAO;

    @Test
    void getAllCoursesTest() {
        Course course = new Course();
        List<Course> courseList = Arrays.asList(course);
        Mockito.when(courseDAO.getAllCourses()).thenReturn(courseList);
        Assertions.assertEquals(1, courseDAO.getAllCourses().size());
    }

    @BeforeEach
    void setUp() {
    }
}