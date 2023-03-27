package com.sinopic.controller;

import com.sinopic.pojo.TeacherCourse;
import com.sinopic.service.TeacherCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachercourse")
public class TeacherCourseController {
    @Autowired
    private TeacherCourseService teachercourseService;

    // 添加
    @PostMapping("/add")
    public boolean addTeacherCourse(@RequestBody TeacherCourse teachercourse) {
        return teachercourseService.addTeacherCourse(teachercourse);
    }

    //删除课程
    //@GetMapping("/del/{courseId}")
    @DeleteMapping("/del/{teacherId}")
    public String deleteTeacherCourse(@PathVariable("teacherId") Integer teacherId) {
        Integer integer = teachercourseService.deleteTeacherCourseById(teacherId);
        return String.valueOf(integer);
    }

    // 根据ID修改课程
    //@PostMapping("/course/update")
    @PutMapping("/update")
    public String updateTeacherCourse(@RequestBody TeacherCourse teachercourse) {
        Integer integer = teachercourseService.updateTeacherCourseById(teachercourse);
        return String.valueOf(integer);
    }
}
