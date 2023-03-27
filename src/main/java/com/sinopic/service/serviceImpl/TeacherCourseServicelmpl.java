package com.sinopic.service.serviceImpl;

import com.sinopic.mapper.TeacherCourseMapper;
import com.sinopic.pojo.TeacherCourse;
import com.sinopic.service.TeacherCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherCourseServicelmpl implements TeacherCourseService {
    @Autowired
    private TeacherCourseMapper teachercourseMapper;

    @Override
    public boolean addTeacherCourse(TeacherCourse teachercourse) {
        return teachercourseMapper.addTeacherCourse(teachercourse) > 0;
    }

    @Override
    public Integer deleteTeacherCourseById(Integer teacherId) {
        return teachercourseMapper.deleteTeacherCourseById(teacherId);
    }

    @Override
    public Integer updateTeacherCourseById(TeacherCourse teachercourse) { return teachercourseMapper.updateTeacherCourseById(teachercourse);}
}
