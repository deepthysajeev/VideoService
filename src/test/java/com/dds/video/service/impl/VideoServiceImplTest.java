package com.dds.video.service.impl;

import com.dds.video.dao.VideoDAO;
import com.dds.video.model.Video;
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
class VideoServiceImplTest {

    @Mock
    private VideoDAO videoDAO;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllVideosTest() {
        Video video = new Video();
        List<Video> videoList = Arrays.asList(video);
        Mockito.when(videoDAO.getAllVideos()).thenReturn(videoList);
        Assertions.assertEquals(1, videoDAO.getAllVideos().size());
    }


}