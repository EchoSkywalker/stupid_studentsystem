package com.sinopic.service.serviceImpl;

import com.sinopic.mapper.StudentMapper;
import com.sinopic.pojo.Student;
import com.sinopic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServicelmpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public boolean addStudent(Student student) {
        return studentMapper.addStudent(student) > 0;
    }

    //批量增加
    @Override
    public Integer addStudentList(List<Student> students) {return studentMapper.addStudentList(students);}

    @Override
    public Integer deleteStudentById(Integer studentId) {
        return studentMapper.deleteStudentById(studentId);
    }

    @Override
    public Integer updateStudentById(Student student) {
        return studentMapper.updateStudentById(student);
    }

    @Override
    public Student findStudentById(Integer studentId) {
        return studentMapper.findStudentById(studentId);
    }
}
