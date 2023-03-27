package com.sinopic.mapper;

import com.sinopic.pojo.TeacherCourse;
import org.apache.ibatis.annotations.*;

@Mapper
public interface TeacherCourseMapper {

        // 添加
        Integer addTeacherCourse(TeacherCourse teachercourse);

        // 根据ID删除
        Integer deleteTeacherCourseById(Integer teacherId);

        // 根据ID修改
        Integer updateTeacherCourseById(TeacherCourse teachercourse);


}
