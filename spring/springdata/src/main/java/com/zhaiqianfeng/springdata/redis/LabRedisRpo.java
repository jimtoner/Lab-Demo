package com.zhaiqianfeng.springdata.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * @author Chris.zhai
 * @since Oct 14,2017
 */
@Component
public class LabRedisRpo {
    // inject the actual template
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void save() {
        ValueOperations<String,String> valueOperations=redisTemplate.opsForValue();
        valueOperations.set("c", "b");
        //valueOperations.getOperations().delete("c");
        //redisTemplate.delete("c");
    }

}