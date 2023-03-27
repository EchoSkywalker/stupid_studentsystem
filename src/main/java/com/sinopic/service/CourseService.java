package com.sinopic.service;

import com.sinopic.pojo.Course;

import java.util.List;

public interface CourseService {
    boolean addCourse(Course course);

    Integer deleteCourseById(Integer courseId);

    Integer updateCourseById(Course course);

    Course findCourseById(Integer courseId);

    List<Course> getAll();
}
