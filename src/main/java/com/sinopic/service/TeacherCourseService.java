package com.sinopic.service;

import com.sinopic.pojo.TeacherCourse;

public interface TeacherCourseService {
    //增加教师选课信息
    boolean addTeacherCourse(TeacherCourse teachercourse);

    // 按教师ID删除教师选课信息
    Integer deleteTeacherCourseById(Integer teacherId);

    // 按教师ID改变教师选课信息
    Integer updateTeacherCourseById(TeacherCourse teachercourse);

}
