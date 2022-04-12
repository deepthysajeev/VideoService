package com.dds.video.dao.impl;

import com.dds.video.model.Video;
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
class VideoDAOImplTest {

    @InjectMocks
    private VideoDAOImpl videoDAO;

    @Mock
    private EntityManager entityManager;

    @Mock
    private Query query;


    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllVideosTest() {
        Mockito.when(entityManager.createQuery(VideoDAOImpl.LIST_VIDEOS)).thenReturn(query);
        Video video =new Video();
        List<Video> videoList = Arrays.asList(video);
        Mockito.when(query.getResultList()).thenReturn(videoList);
        Assertions.assertEquals(1,videoDAO.getAllVideos().size());
    }
}