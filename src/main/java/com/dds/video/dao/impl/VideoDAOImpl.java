package com.dds.video.dao.impl;

import com.dds.video.dao.VideoDAO;
import com.dds.video.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class VideoDAOImpl implements VideoDAO {

    @Autowired
    EntityManager entityManager;

    public static final String LIST_VIDEOS = "select v from Video v";

    @Override
    public List<Video> getAllVideos() {
        Query query = entityManager.createQuery(LIST_VIDEOS);
        return query.getResultList();
    }
}
