package com.university.student.controller;

import com.university.student.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/auth")
public class AuthController {

    @Autowired
    AuthService authService;
    @CrossOrigin()
    @PostMapping("/{userName}/{pass}")
    public Boolean auth(@PathVariable String userName,@PathVariable String pass){
        log.info("AuthController.auth() invoked.");
        return authService.getallstudent(userName,pass);
    }

}
