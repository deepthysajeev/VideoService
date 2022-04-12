package com.dds.video.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Video")
@Setter
@Getter
@Builder
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
