package com.sinopic.mapper;

import com.sinopic.pojo.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CourseMapper {
    // 添加课
    //@Insert("INSERT INTO course(course_id, course_number, course_name, course_school)VALUES(#{courseId},#{courseNumber},#{courseName},#{courseSchool})")
    Integer addCourse(Course course);

    // 根据ID删除课程
    //@Delete("DELETE FROM course WHERE course_id = #{courseId}")
    Integer deleteCourseById(Integer courseId);

    // 根据ID修改课程
    //@Update("Update course SET course_number = #{courseNumber}, course_name = #{courseName}, course_school = #{courseSchool} WHERE course_id = #{courseId}")
    Integer updateCourseById(Course course);

    // 根据ID查询课程
//    @Select(value = {"SELECT course_id as courseId, course_name as courseName, course_number as courseNumber, course_school as courseSchool FROM course WHERE course_id = #{courseId}"})
    Course findCourseById(Integer courseId);

    // 查询所有课程
    List<Course> selectAll();
}
