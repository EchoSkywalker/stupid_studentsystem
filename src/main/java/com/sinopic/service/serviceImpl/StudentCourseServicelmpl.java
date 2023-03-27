package com.sinopic.service.serviceImpl;


import com.sinopic.mapper.StudentCourseMapper;
import com.sinopic.pojo.Course;
import com.sinopic.pojo.StudentCourse;
import com.sinopic.pojo.Teacher;
import com.sinopic.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCourseServicelmpl implements StudentCourseService {
    @Autowired
    private StudentCourseMapper studentcourseMapper;

    @Override
    public boolean addStudentCourse(StudentCourse studentcourse) {
        return studentcourseMapper.addStudentCourse(studentcourse) > 0;
    }

    @Override
    public Integer deleteStudentCourseById(Integer studentId) {
        return studentcourseMapper.deleteStudentCourseById(studentId);
    }

    @Override
    public Integer updateStudentCourseById(StudentCourse studentcourse) { return studentcourseMapper.updateStudentCourseById(studentcourse);}

    @Override
    public List<Course> selectCourseByStudentId(Integer studentId) { return studentcourseMapper.selectCourseByStudentId(studentId);}

    @Override
    public List<Teacher> selectTeacherByCourseId(Integer courseId) { return studentcourseMapper.selectTeacherByCourseId(courseId);}
}
