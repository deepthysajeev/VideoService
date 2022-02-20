package com.dds.video.service.impl;

import com.dds.video.dao.VideoDAO;
import com.dds.video.model.Video;
import com.dds.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoDAO videoDAO;

    @Override
    public List<Video> getAllVideos() {
        return videoDAO.getAllVideos();
    }
}
