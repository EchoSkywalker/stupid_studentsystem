package com.sinopic.controller;


import com.sinopic.mapper.TeacherMapper;
import com.sinopic.pojo.Teacher;
import com.sinopic.service.CourseService;
import com.sinopic.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
//    @Autowired
//    private TeacherMapper teacherMapper;

    @Autowired
    private TeacherService teacherService;

    // 添加教师
    @PostMapping("/add")
    public boolean addTeacher(@RequestBody Teacher teacher) {return teacherService.addTeacher(teacher);}

    //删除教师
    @DeleteMapping("/del/{teacherId}")
    public String deleteTeacher(@PathVariable("teacherId") Integer teacherId) {
        Integer integer = teacherService.deleteTeacherById(teacherId);
        return String.valueOf(integer);
    }

    // 根据ID修改教师
    @PutMapping("/update")
    public String updateTeacher(@RequestBody Teacher teacher) {
        Integer integer = teacherService.updateTeacherById(teacher);
        return String.valueOf(integer);
    }

    // 根据ID查询教师
    @GetMapping("/query/{teacherId}")
    public Teacher findTeacherById(@PathVariable("teacherId") Integer teacherId) {
        Teacher teacher = teacherService.findTeacherById(teacherId);
        return teacher;
    }
}
