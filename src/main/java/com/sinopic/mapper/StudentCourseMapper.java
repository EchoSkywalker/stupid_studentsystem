package com.sinopic.mapper;

import com.sinopic.pojo.Course;
import com.sinopic.pojo.StudentCourse;
import com.sinopic.pojo.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentCourseMapper {
    // 添加
    Integer addStudentCourse(StudentCourse studentcourse);

    // 根据ID删除
    Integer deleteStudentCourseById(Integer studentId);

    // 根据ID修改
    Integer updateStudentCourseById(StudentCourse studentcourse);

    // 根据学生ID查询课程
    List<Course> selectCourseByStudentId(Integer studentId);

    // 根据课程ID查询老师
    List<Teacher> selectTeacherByCourseId(Integer courseId);

}
