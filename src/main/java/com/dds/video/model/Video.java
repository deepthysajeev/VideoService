package com.dds.video.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Video")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Video {

    @Id
    @Column(name = "VideoID")
    private String videoID;

    @Column(name = "VideoName")
    private String videoName;

    @Column(name = "VideoLink")
    private String videoLink;

    @Column(name = "VideoDesc")
    private String videoDesc;
}
