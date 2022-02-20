package com.dds.video.controller;

import com.dds.video.model.Video;
import com.dds.video.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class VideoController {

    @Autowired
    VideoService videoService;

    @RequestMapping(value = "/videos", method = RequestMethod.GET)
    public List<Video> getVideos() {
        return videoService.getAllVideos();
    }
}
