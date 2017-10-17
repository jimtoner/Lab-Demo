package com.zhaiqianfeng.springdata;

import com.zhaiqianfeng.model.User;
import com.zhaiqianfeng.springdata.mongo.LabMongoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import static org.junit.Assert.*;

/**
 * @author Chris.zhai
 * @since Oct 14,2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LabMongoServiceTest {
    @Autowired
    private LabMongoService labMongoService;

    @Test
    public void save() throws Exception {
        User user=new User();
        user.setUserId(1);
        user.setName("chirs");
        user.setAge(30);
        user.setAddr("龙岗");
        labMongoService.save(user);
        Assert.isTrue(true);
    }

}