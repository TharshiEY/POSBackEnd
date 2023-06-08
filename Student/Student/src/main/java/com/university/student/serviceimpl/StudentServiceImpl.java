package com.university.student.serviceimpl;

import com.university.student.domain.Student;
import com.university.student.domain.StudentRepository;
import com.university.student.dto.StudentDto;
import com.university.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getallstudent() {
        log.info("StudentServiceImpl.getstudent() invoked.");
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student std) {
        log.info("StudentServiceImpl.createStudent() invoked.");
        return studentRepository.save(std);
    }


    public Student updateStudent(Long id, Student std) {
        Student student = studentRepository.findById(id).orElse(null);
        if (std.getFirstName() != null || !getallstudent().isEmpty()){
            student.setFirstName(std.getFirstName());
        }
//        if (std.getLastName())
        student.setLastName(std.getLastName());
        student.setAge(std.getAge());
        return studentRepository.save(student);
    }

    @Override
    public Student getbyid(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}
