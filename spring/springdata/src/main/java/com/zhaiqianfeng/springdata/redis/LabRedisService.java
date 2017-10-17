package com.zhaiqianfeng.springdata.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Chris.zhai
 * @since Oct 14,2017
 */
@Component
public class LabRedisService {

    @Autowired
    private LabRedisRpo labRedisRpo;

    public void save(){
        labRedisRpo.save();
    }
}