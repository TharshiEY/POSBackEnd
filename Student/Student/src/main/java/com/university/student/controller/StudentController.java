package com.university.student.controller;

import com.university.student.domain.Student;
import com.university.student.dto.StudentDto;
import com.university.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @CrossOrigin()
    @GetMapping()
    public List<Student> getStudent(){
        log.info("StudentController.getstudent() invoked.");
        return studentService.getallstudent();
    }

    @GetMapping("/{id}")
    public Student getbyid(@PathVariable Long id){
        log.info("StudentController.getbyid() invoked.");
        return studentService.getbyid(id);
    }
    @PostMapping()
    public Student createStudent(@RequestBody Student std){
        log.info("StudentController.createStudent() invoked.");
        return studentService.createStudent(std);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id ,@RequestBody Student std){
        log.info("StudentController.updateStudent() invoked.");
        return studentService.updateStudent(id, std);
    }
}
