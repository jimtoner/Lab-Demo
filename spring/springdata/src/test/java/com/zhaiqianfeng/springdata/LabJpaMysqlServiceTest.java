package com.zhaiqianfeng.springdata;

import com.zhaiqianfeng.jpa.LabJpaMysqlService;
import com.zhaiqianfeng.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * @author Chris.zhai
 * @since Oct 14,2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LabJpaMysqlServiceTest {
    @Autowired
    private LabJpaMysqlService labJpaMysqlService;

    @Test
    public void save() throws Exception {
        User user=new User();
        user.setUserId(1);
        user.setName("chirs");
        user.setAge(30);
        user.setAddr("龙岗");
        labJpaMysqlService.save(user);
    }

}