package com.dds.video.dao.impl;

import com.dds.video.model.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class CourseDAOImplTest {

    @InjectMocks
    private CourseDAOImpl courseDAO;

    @Mock
    private EntityManager entityManager;

    @Mock
    private Query query;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllCoursesTest() {
        Mockito.when(entityManager.createQuery(CourseDAOImpl.LIST_COURSES)).thenReturn(query);
        Course course =new Course();
        List<Course> courseList = Arrays.asList(course);
        Mockito.when(query.getResultList()).thenReturn(courseList);
        Assertions.assertEquals(1,courseDAO.getAllCourses().size());
    }
}