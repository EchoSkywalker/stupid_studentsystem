package com.sinopic.mapper;

import com.sinopic.pojo.Teacher;
import org.apache.ibatis.annotations.*;

@Mapper
public interface TeacherMapper {

    // 添加教师
    //@Insert("INSERT INTO teacher(teacher_id, teacher_number, teacher_name, teacher_school, teacher_gender, teacher_birthday)VALUES(#{teacherId},#{teacherNumber},#{teacherName},#{teacherSchool},#{teacherGender},#{teacherBirthday})")
    Integer addTeacher(Teacher teacher);

    // 根据ID删除教师
    //@Delete("DELETE FROM teacher WHERE teacher_id = #{teacherId}")
    Integer deleteTeacherById(Integer teacherId);

    // 根据ID修改教师
   // @Update("Update teacher SET teacher_number = #{teacherNumber}, teacher_name = #{teacherName}, teacher_school = #{teacherSchool}, teacher_gender = #{teacherGender}, teacher_birthday = #{teacherBirthday} WHERE teacher_id = #{teacherId}")
    Integer updateTeacherById(Teacher teacher);

    // 根据ID查询教师
   // @Select(value = {"SELECT teacher_id as teacherId, teacher_name as teacherName, teacher_number as teacherNumber, teacher_school as teacherSchool, teacher_gender as teacherGender, teacher_birthday as teacherBirthday FROM teacher WHERE teacher_id = #{teacherId}"})
    Teacher findTeacherById(Integer teacherId);
}
