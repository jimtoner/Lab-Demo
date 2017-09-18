package com.zhaiqianfeng.jpademo.repository;

import com.zhaiqianfeng.jpademo.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chris.zhai
 * @since Sep 15,2017
 */
public interface UserRepository extends CrudRepository<User,Integer> {
}
