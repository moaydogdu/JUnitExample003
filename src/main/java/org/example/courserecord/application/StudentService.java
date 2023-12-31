package org.example.courserecord.application;



import org.example.courserecord.model.Course;
import org.example.courserecord.model.Semester;
import org.example.courserecord.model.Student;
import org.example.courserecord.model.StudentCourseRecord;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


/**
 * @author mucahitkurt
 * @since 30.04.2018
 */
public interface StudentService {

    void addCourse(String studentId, Course course);

    void addCourse(String studentId, Course course, Semester semester);

    void dropCourse(String studentId, Course course);

    void addGrade(String studentId, Course course, StudentCourseRecord.Grade grade);

    boolean isTakeCourse(String studentId, Course course);

    BigDecimal gpa(String studentId);

    List<TranscriptItem> transcript(String studentId);

    Optional<Student> findStudent(String studentId);

    void deleteStudent(String studentId);
}
