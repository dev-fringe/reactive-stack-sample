package dev.fringe.crud.model;

import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name="COURSE")
@Audited
public class Course {

    private long courseId;
    private String courseName;

    public Course() {
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    @Id
    @GeneratedValue
    @Column(name="COURSE_ID")
    public long getCourseId() {
        return this.courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    @Column(name="COURSE_NAME", nullable=false)
    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}