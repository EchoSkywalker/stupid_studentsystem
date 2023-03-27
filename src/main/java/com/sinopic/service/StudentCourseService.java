package com.sinopic.service;

import com.sinopic.pojo.Course;
import com.sinopic.pojo.StudentCourse;
import com.sinopic.pojo.Teacher;

import java.util.List;

public interface StudentCourseService {

    //增加学生选课信息
    boolean addStudentCourse(StudentCourse studentcourse);

    // 按学生ID删除学生选课信息
    Integer deleteStudentCourseById(Integer studentId);

    // 按ID改变学生选课信息
    Integer updateStudentCourseById(StudentCourse studentcourse);

    // 按ID查找学生选课信息
    List<Course> selectCourseByStudentId(Integer studentId);

    // 按课程ID查找教师信息
    List<Teacher> selectTeacherByCourseId(Integer courseId);

    // 按学院、专业、班级增加学生选课信息
//    boolean addStudentCourseBygroup(StudentCourse studentcourse); todo
}
