package com.sinopic.pojo;

public class Course {
    private Integer courseId;
    private Integer courseNumber;
    private String courseName;
    private String courseSchool;

    // GET AND SET


    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseSchool() {
        return courseSchool;
    }

    public void setCourseSchool(String courseSchool) {
        this.courseSchool = courseSchool;
    }
}
