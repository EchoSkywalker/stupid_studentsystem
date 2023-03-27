package com.sinopic.controller;


import com.sinopic.pojo.Course;
import com.sinopic.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
//    @Autowired
//    private CourseMapper courseMapper;

    @Autowired
    private CourseService courseService;

    // 添加课程
    @PostMapping("/add")
    public boolean addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    //删除课程
    //@GetMapping("/del/{courseId}")
    @DeleteMapping("/del/{courseId}")
    public String deleteCourse(@PathVariable("courseId") Integer courseId) {
        Integer integer = courseService.deleteCourseById(courseId);
        return String.valueOf(integer);
    }

    // 根据ID修改课程
    //@PostMapping("/course/update")
    @PutMapping("/update")
    public String updateCourse(@RequestBody Course course) {
        Integer integer = courseService.updateCourseById(course); //
        return String.valueOf(integer);
    }

    // 根据ID查询课程
    @GetMapping("/query/{courseId}")
    public Course findCourseById(@PathVariable("courseId") Integer courseId) {
        Course course = courseService.findCourseById(courseId);
        return course;
    }

    // 查询所有课程
    @GetMapping("/query-all")
    public List<Course> getALL(){
        List<Course> courseList = courseService.getAll();
        return courseList;
    }
}
