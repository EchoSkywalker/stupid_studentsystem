package com.sinopic.service.serviceImpl;

import com.sinopic.mapper.TeacherMapper;
import com.sinopic.pojo.Teacher;
import com.sinopic.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServicelmpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public boolean addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher(teacher) > 0;
    }

    @Override
    public Integer deleteTeacherById(Integer teacherId) {
        return teacherMapper.deleteTeacherById(teacherId);
    }

    @Override
    public Integer updateTeacherById(Teacher teacher) {return teacherMapper.updateTeacherById(teacher);}

    @Override
    public Teacher findTeacherById(Integer teacherId) {return teacherMapper.findTeacherById(teacherId);}
}
