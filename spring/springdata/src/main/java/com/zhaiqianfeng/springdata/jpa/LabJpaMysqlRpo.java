package com.zhaiqianfeng.springdata.jpa;

import com.zhaiqianfeng.springdata.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author Chris.zhai
 * @since Oct 14,2017
 */
@Component
public interface LabJpaMysqlRpo extends JpaRepository<User,Integer>{

}