package com.dds.video.dao.impl;

import com.dds.video.dao.CourseDAO;
import com.dds.video.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    EntityManager entityManager;

    public static final String LIST_COURSES = "select c from Course c";


    @Override
    public List<Course> getAllCourses() {
        Query query = entityManager.createQuery(LIST_COURSES);
        return query.getResultList();
    }
}