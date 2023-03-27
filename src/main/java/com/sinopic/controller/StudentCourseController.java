package com.sinopic.controller;

import com.sinopic.pojo.Course;
import com.sinopic.pojo.StudentCourse;
import com.sinopic.pojo.Teacher;
import com.sinopic.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {

    @Autowired
    private StudentCourseService studentcourseService;

    // 添加
    @PostMapping("/add")
    public boolean addStudentCourse(@RequestBody StudentCourse studentcourse) {
        return studentcourseService.addStudentCourse(studentcourse);
    }

    //删除课程
    //@GetMapping("/del/{courseId}")
    @DeleteMapping("/del/{studentId}")
    public String deleteStudentCourse(@PathVariable("studentId") Integer studentId) {
        Integer integer = studentcourseService.deleteStudentCourseById(studentId);
        return String.valueOf(integer);
    }

    // 根据ID修改课程
    //@PostMapping("/course/update")
    @PutMapping("/update")
    public String updateStudentCourse(@RequestBody StudentCourse studentcourse) {
        Integer integer = studentcourseService.updateStudentCourseById(studentcourse);
        return String.valueOf(integer);
    }

    // 根据ID查询课程
    @GetMapping("/querycourse/{studentId}")
    public List<Course> selectCourseByStudentId(@PathVariable("studentId") Integer studentId) {
        List<Course> courseList = studentcourseService.selectCourseByStudentId(studentId);
        return courseList;
    }

    // 根据课程ID查询教师
    @GetMapping("/queryteacher/{courseId}")
    public List<Teacher> selectTeacherByCourseId(@PathVariable("courseId") Integer courseId) {
        List<Teacher> teacherList = studentcourseService.selectTeacherByCourseId(courseId);
        return teacherList;
    }

}
