package com.sinopic.controller;

import com.sinopic.pojo.Course;
import com.sinopic.pojo.Student;
import com.sinopic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
//    @Autowired
//    private StudentMapper studentMapper;

    @Autowired
    private StudentService studentService;

    // 添加学生
    @PostMapping("/add")
    public boolean addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // todo 若添加的信息已存在，则500
    //批量添加学生
    @PostMapping("/addStudentList")
    public String addStudentList(@RequestBody List<Student> students) {
        Integer integer = studentService.addStudentList(students);
        return String.valueOf(integer);
    }

//     删除学生
    @DeleteMapping("/del/{studentId}")
    public String deleteStudent(@PathVariable("studentId") Integer studentId) {
        Integer integer = studentService.deleteStudentById(studentId);
        return String.valueOf(integer);
    }

    // 根据ID修改学生
    @PutMapping("/update")
    public String updateStudent(@RequestBody Student student) {
        Integer integer = studentService.updateStudentById(student);
        return String.valueOf(integer);
    }

    // 根据ID查询学生
    @GetMapping("/query/{studentId}")
    public Student findStudentById(@PathVariable("studentId") Integer studentId) {
        Student student = studentService.findStudentById(studentId);
        return student;
    }



}
