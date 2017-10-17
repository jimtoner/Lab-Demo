package com.zhaiqianfeng.springdata.jpa;


import com.zhaiqianfeng.springdata.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Chris.zhai
 * @since Oct 14,2017
 */
@Service
public class LabJpaMysqlService{
    @Autowired
    private LabJpaMysqlRpo labJpaMysqlRpo;

    public void save(User user){
        labJpaMysqlRpo.save(user);
    }

}