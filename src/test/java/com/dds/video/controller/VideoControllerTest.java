package com.dds.video.controller;

import com.dds.video.model.Video;
import com.dds.video.service.VideoService;
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
class VideoControllerTest {

    @Mock
    VideoService videoService;

    @BeforeEach
    void setUp() {
    }

    @Test
        void getAllVideosTest() {
            Video video = new Video();
            List<Video> videoList = Arrays.asList(video);
            Mockito.when(videoService.getAllVideos()).thenReturn(videoList);
            Assertions.assertEquals(1, videoService.getAllVideos().size());
    }


}