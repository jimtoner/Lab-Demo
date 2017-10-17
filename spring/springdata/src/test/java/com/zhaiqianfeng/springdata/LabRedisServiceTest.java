package com.zhaiqianfeng.springdata;

import com.example.springdata.redis.LabRedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Chris.zhai
 * @since Oct 14,2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LabRedisServiceTest {

    @Autowired
    private LabRedisService labRedisService;

    @Test
    public void save() throws Exception {
        labRedisService.save();
    }

}