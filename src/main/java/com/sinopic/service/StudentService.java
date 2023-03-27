package com.sinopic.service;

import com.sinopic.pojo.Student;

import java.util.List;

public interface StudentService {

    boolean addStudent(Student student);

    //批量增加数据
    Integer addStudentList(List<Student> students);

    Integer deleteStudentById(Integer studentId);

    Integer updateStudentById(Student student);

    Student findStudentById(Integer studentId);
}
