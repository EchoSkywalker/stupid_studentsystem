package com.sinopic.mapper;

import com.sinopic.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    // 添加学生
    //@Insert("insert into Person(pName,birthday,salary,summary) values(#{pName},#{birthday},#{salary},#{summary})")
    //@Insert("INSERT INTO student(student_id, student_number, student_name, student_grade, student_school, student_major, student_class, student_gender, student_birthday)VALUES(#{studentId},#{studentNumber},#{studentName},#{studentGrade},#{studentSchool},#{studentMajor},#{studentClass},#{studentGender},#{studentBirthday})")
    Integer addStudent(Student student);

    //批量添加学生 todo 注释的功能是
    Integer addStudentList(@Param("students") List<Student> students);

    // 根据ID删除学生
    //@Delete("DELETE FROM student WHERE student_id = #{studentId}")
    Integer deleteStudentById(Integer studentId);


    // 根据ID修改学生
    //@Update("Update student SET student_number = #{studentNumber}, student_name = #{studentName}, student_grade = #{studentGrade}, student_school = #{studentSchool}, student_major = #{studentMajor}, student_class = #{studentClass}, student_gender = #{studentGender}, student_birthday = #{studentBirthday} WHERE student_id = #{studentId}")
    Integer updateStudentById(Student student);

    // 根据ID查询学生
//    @Select(value = {"SELECT student_id as studentId, student_name as studentName, student_number as studentNumber, student_grade as studentGrade, student_school as studentSchool, student_major as studentMajor, student_class as studentClass,student_gender as studentGender, student_birthday as studentBirthday FROM student WHERE student_id = #{studentId}"})
    Student findStudentById( Integer studentId);


}
