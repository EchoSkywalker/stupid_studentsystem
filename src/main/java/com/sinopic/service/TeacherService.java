package com.sinopic.service;

import com.sinopic.pojo.Teacher;

public interface TeacherService {

    boolean addTeacher(Teacher teacher);

    Integer deleteTeacherById(Integer teacherId);

    Integer updateTeacherById(Teacher teacher);

    Teacher findTeacherById(Integer teacherId);
    
}
