package com.university.student.service;

import com.university.student.domain.Student;
import com.university.student.dto.StudentDto;

import java.util.List;

public interface StudentService {

    public List<Student> getallstudent();

    public Student createStudent(Student std);

    public Student updateStudent(Long id, Student std);

    public Student getbyid(Long id);
}
