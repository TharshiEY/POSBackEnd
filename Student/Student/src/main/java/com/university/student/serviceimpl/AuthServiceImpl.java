package com.university.student.serviceimpl;

import com.university.student.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public Boolean getallstudent(String userName,String pass) {
        log.info("AuthServiceImpl.auth() invoked.");
        if (userName.equals("Tharshi")&&pass.equals("Test")){
            return true;
        } else {
            return false;
        }
    }
}
