package com.barath.app.service;

import com.barath.app.model.User;
import com.barath.app.repository.UserRepository;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author barath
 */
@Service
public class UserService {

    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByUserName(String userName){      
        return this.userRepository.findByUserName(userName);
    }


    @PostConstruct
    public void init(){
        this.userRepository.save(new User("1","barath"));
    }

}
