package com.zhaiqianfeng.jpademo.controller;


import com.zhaiqianfeng.jpademo.model.User;
import com.zhaiqianfeng.jpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris.zhai
 * @since Sep 15,2017
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    /*@Autowired
    private EntityManagerFactory entityManagerFactory;*/

    @RequestMapping("/list")
    public String getUsers(){
        StringBuilder stringBuilder=new StringBuilder();
        Iterable<User> users=userRepository.findAll();
        users.forEach(user -> {
            stringBuilder.append(user.getUserName()).append(" - ");
        });

        return  stringBuilder.toString();
    }


    @RequestMapping("/add")
    public String addUsers(){
        User user=new User();
        user.setUserName("james");
        userRepository.save(user);
        return "ok";
    }
}
