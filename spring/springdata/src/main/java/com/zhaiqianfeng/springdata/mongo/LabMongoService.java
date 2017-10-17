package com.zhaiqianfeng.springdata.mongo;

import com.zhaiqianfeng.springdata.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Chris.zhai
 * @since Oct 14,2017
 */
@Component
public class LabMongoService {
    @Autowired
    private LabMongoRpo labRpo;


    public void save(User user){
        labRpo.save(user);
    }
}
