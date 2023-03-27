package com.sinopic.service.serviceImpl;

import com.sinopic.mapper.CourseMapper;
import com.sinopic.pojo.Course;
import com.sinopic.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public boolean addCourse(Course course) {
        return courseMapper.addCourse(course) > 0;
    }

    @Override
    public Integer deleteCourseById(Integer courseId) {
        return courseMapper.deleteCourseById(courseId);
    }

    @Override
    public Integer updateCourseById(Course course) { return courseMapper.updateCourseById(course);}

    @Override
    public Course findCourseById(Integer courseId) { return courseMapper.findCourseById(courseId);}

    @Override
    public List<Course> getAll() {
        return courseMapper.selectAll();
    }


}
