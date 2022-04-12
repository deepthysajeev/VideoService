package com.dds.video.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Course")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @ManyToMany
    @JoinTable(
            name = "VideoCourse",
            joinColumns = @JoinColumn(name = "CourseID"),
            inverseJoinColumns = @JoinColumn(name = "VideoID"))
    Set<Video> videoList;

    @Id
    @Column(name = "CourseID")
    private String courseID;

    @Column(name = "CourseName")
    private String courseName;

    @Column(name = "CourseDesc")
    private String courseDesc;
}
